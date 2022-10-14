package com.example.wordcountapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordCountAPICalculatorController {
    WordCountAPICalculator a = new WordCountAPICalculator();

    @RequestMapping("/words")
    public int Wordcount(@RequestParam String k){
        return a.WordCount(k);
    }

}
