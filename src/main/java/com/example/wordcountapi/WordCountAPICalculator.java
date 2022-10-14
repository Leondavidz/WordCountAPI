package com.example.wordcountapi;

public class WordCountAPICalculator {
    public int  WordCount(String k){
    return k.split("\\s+").length;
    }
}
