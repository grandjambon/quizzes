package com.pj.quizzes.literacy;

import javax.annotation.PostConstruct;
import java.util.*;

@SuppressWarnings("unused")
public class SpellingList {

    private final Map<KeyStage, List<String>> wordLists;

    // constructor for unit tests
    SpellingList(Map<KeyStage, List<String>> wordLists) {
        this.wordLists = wordLists;
    }

    public SpellingList() {
        this(new HashMap<>());
    }

    @PostConstruct
    public void initialise() {
        Arrays.asList(KeyStage.values()).forEach(this::loadWordList);
    }

    private void loadWordList(KeyStage keyStage) {
        Scanner scanner = new Scanner(SpellingList.class.getResourceAsStream("/data/spellings/"+keyStage.getDirectory()+"/spellings.dat"));
        List<String> wordList = wordLists.computeIfAbsent(keyStage, keyStage1 -> new ArrayList<>());
        while (scanner.hasNext()) {
            wordList.add(scanner.next());
        }
    }

    public Collection<String> createSpellingList(int numWords, KeyStage keyStage) {
        List<String> copy = new ArrayList<>(wordLists.get(keyStage));
        Random rand = new Random();
        List<String> returnList = new ArrayList<>();
        for (int i=0; i<numWords; i++) {
            int randomIndex = rand.nextInt(copy.size());
            String randomElement = copy.get(randomIndex);
            copy.remove(randomIndex);
            returnList.add(randomElement);
        }

        return returnList;
    }


    List<String> getWordList(KeyStage keyStage) {
        return wordLists.get(keyStage);
    }
}
