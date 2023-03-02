package com.example.demo.controller;

import com.example.demo.pojo.Quiz;
import com.example.demo.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuizController {
    @Autowired
    QuizService quizService;

    @RequestMapping(value = "/rest/getQuizByLevel/{level}/{position}")
    public Object getQuizList(@PathVariable("level") String level, @PathVariable("position") int position) {
        List<Quiz> quizList = quizService.getListByLevel(level, position);
        String temp = "";
        for (int i = 0; i < quizList.size(); i++) {
            temp += quizList.get(i).getContent() + "\n";
        }
        return quizList;
    }
}
