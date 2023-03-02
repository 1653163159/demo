package com.example.demo.service.impl;

import com.example.demo.dao.QuizMapper;
import com.example.demo.pojo.Quiz;
import com.example.demo.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    QuizMapper quizMapper;

    @Override
    public List<Quiz> getListByLevel(String level, int position) {
        return quizMapper.selectQuziListByLevel(level, position);
    }
}
