package com.example.demo.service;

import com.example.demo.pojo.Quiz;

import java.util.List;

public interface QuizService {
    public List<Quiz> getListByLevel(String level, int position);
}
