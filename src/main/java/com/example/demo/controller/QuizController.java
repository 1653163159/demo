package com.example.demo.controller;

import com.example.demo.pojo.Quiz;
import com.example.demo.service.QuizService;
import com.example.demo.tools.Flags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

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

    @RequestMapping(value = "/rest/getQuizByLevel/{level}")
    public Object getQuizListR(@PathVariable("level") String level) {
        Random random = new Random();
        int maxCount = 30;
        switch (level) {
            case Flags.INTERMEDIATE:
                maxCount = Flags.QUIZ_INTERMEDIATE_COUNT;
                break;
            case Flags.ADVANCED:
                maxCount = Flags.QUIZ_ADVANCED_COUNT;
                break;
            case Flags.BEGINNER:
            default:
                maxCount = Flags.QUIZ_BEGINNER_COUNT;
        }
        int position = random.nextInt(maxCount);
        if (position > maxCount - 10) {
            position -= 10;
        }
        return quizService.getListByLevel(level, position);
    }
}
