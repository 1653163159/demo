package com.example.demo.service;

import com.example.demo.pojo.Word;

import java.util.List;

public interface WordService {
    public List<Word> getWordList(String level, int position);
}
