package com.pj.quizzes.springboot;

import com.pj.quizzes.literacy.Letter;
import com.pj.quizzes.literacy.SpellingList;
import com.pj.quizzes.maths.MathsQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.pj.quizzes.literacy.KeyStage.KS1;
import static com.pj.quizzes.literacy.KeyStage.KS2;

@SuppressWarnings("unused")
@Controller
public class QuizzesController {

    @Autowired
    private SpellingList spellingList;

    @Autowired
    private MathsQuestions mathsQuestions;

    @RequestMapping("/")
    public String home(ModelMap model) {
        return "home";
    }

    @RequestMapping("/bear/spellings")
    public String bearsSpellings(ModelMap model) {
        List<String> spellings = new ArrayList<>();
        spellings.addAll(spellingList.createSpellingList(10, KS1));
        spellings.addAll(spellingList.createSpellingList(5, KS2));
        model.addAttribute("spellings", spellings);
        return "spellings";
    }

    @RequestMapping("/cat/spellings")
    public String catSpellings(ModelMap model) {
        List<String> spellings = new ArrayList<>();
        spellings.addAll(spellingList.createSpellingList(15, KS1));
        model.addAttribute("spellings", spellings);
        return "spellings";
    }

    @RequestMapping("/bear/maths")
    public String bearMaths(ModelMap model) {
        model.addAttribute("maths", mathsQuestions.getQuestions(10, 8, 20, 14));
        return "maths";
    }

    @RequestMapping("/cat/maths")
    public String catMaths(ModelMap model) {
        model.addAttribute("maths", mathsQuestions.getQuestions(24, 20, 0, 0));
        return "maths";
    }

    @RequestMapping("/cat/handwriting")
    public String catHandwriting(ModelMap model) {
        Collection<Letter> letters = new ArrayList<>();
        letters.add(new Letter("b", "baby"));
        letters.add(new Letter("d", "daddy"));
        letters.add(new Letter("y", "yoyo"));
        letters.add(new Letter("3", "30"));
        letters.add(new Letter("5", "50"));
        letters.add(new Letter("9", "90"));
        model.addAttribute("letters", letters);
        return "handwriting";
    }

}