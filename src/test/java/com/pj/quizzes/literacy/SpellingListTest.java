package com.pj.quizzes.literacy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class SpellingListTest {

    private SpellingList spellingList;

    @Before
    public void setup() {
        List<String> ks1List = new ArrayList<>();
        ks1List.add("ks1word1");
        ks1List.add("ks1word2");
        ks1List.add("ks1word3");
        ks1List.add("ks1word4");
        ks1List.add("ks1word5");
        ks1List.add("ks1word6");
        ks1List.add("ks1word7");
        ks1List.add("ks1word8");

        List<String> ks2List = new ArrayList<>();
        ks2List.add("ks2word1");
        ks2List.add("ks2word2");
        ks2List.add("ks2word3");
        ks2List.add("ks2word4");
        ks2List.add("ks2word5");
        ks2List.add("ks2word6");
        ks2List.add("ks2word7");
        ks2List.add("ks2word8");

        Map<KeyStage, List<String>> map = new HashMap<>();
        map.put(KeyStage.KS1, ks1List);
        map.put(KeyStage.KS2, ks2List);

        spellingList = new SpellingList(map);
    }

    @Test
    public void createSpellingList() {
        Collection<String> ks1List = spellingList.createSpellingList(2, KeyStage.KS1);
        Collection<String> ks2List = this.spellingList.createSpellingList(2, KeyStage.KS2);

        assertThat(ks1List, hasSize(greaterThan(0)));
        assertThat(ks2List, hasSize(greaterThan(0)));

        ks1List.forEach(s -> assertThat(s.startsWith("ks1"), is(true)));
        ks2List.forEach(s -> assertThat(s.startsWith("ks2"), is(true)));
    }
}