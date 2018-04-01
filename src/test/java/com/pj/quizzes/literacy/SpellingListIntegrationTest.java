package com.pj.quizzes.literacy;

import com.pj.quizzes.springboot.QuizzesConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collection;
import java.util.List;

import static com.pj.quizzes.literacy.KeyStage.KS1;
import static com.pj.quizzes.literacy.KeyStage.KS2;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={QuizzesConfiguration.class})
public class SpellingListIntegrationTest {

    @Autowired
    private SpellingList spellingList;

    @Test
    public void testLoadingWords() {
        List<String> ks1List = spellingList.getWordList(KS1);
        List<String> ks2List = spellingList.getWordList(KS2);

        assertThat(ks1List, hasSize(greaterThan(0)));
        assertThat(ks2List, hasSize(greaterThan(0)));

        assertThat(ks1List.contains("beautiful"), is(true));
        assertThat(ks1List.contains("sugar"), is(true));
        assertThat(ks2List.contains("beautiful"), is(false));
        assertThat(ks2List.contains("sugar"), is(false));

        assertThat(ks1List.contains("preparation"), is(false));
        assertThat(ks1List.contains("adoration"), is(false));
        assertThat(ks2List.contains("preparation"), is(true));
        assertThat(ks2List.contains("adoration"), is(true));
    }

    @Test
    public void testCreatingList() {
        List<String> ks1List = spellingList.getWordList(KS1);
        List<String> ks2List = spellingList.getWordList(KS2);

        Collection<String> spellingList = this.spellingList.createSpellingList(10, KS1);
        assertThat(spellingList, hasSize(10));
        spellingList.forEach(s -> assertThat(ks1List.contains(s), is(true)));
    }
}