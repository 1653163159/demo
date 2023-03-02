package com.example.demo.controller;

import com.example.demo.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {
    @Autowired
    QuizService quizService;
}
