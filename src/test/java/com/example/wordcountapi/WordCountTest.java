package com.example.wordcountapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountTest {
    WordCountAPICalculator exp =new WordCountAPICalculator();
    @Test
    void wordCoundTest(){
        String a = "Hello";
        int expectedResult = 1;
        int result = exp.WordCount(a);
        assertEquals(expectedResult,result);
    }
}
