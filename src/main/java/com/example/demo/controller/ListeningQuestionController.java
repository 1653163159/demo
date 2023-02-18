package com.example.demo.controller;

import com.example.demo.pojo.AudioBank;
import com.example.demo.pojo.ListeningQuestion;
import com.example.demo.service.AudioBankService;
import com.example.demo.service.ListeningQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class ListeningQuestionController {
    @Autowired
    private ListeningQuestionService listeningQuestionService;


    /*
     * 非RESTFUL风格
     * */
    @RequestMapping(value = "/ListeningQuestion")
    public Object listeningQuestion(int id) throws IOException {
        ListeningQuestion l1 = null;
        l1 = listeningQuestionService.selectByPrimaryKey(id);
        return l1;
    }

    /*
     * RESTFUL设计，返回一个ListeningQuestion
     * */
    @RequestMapping(value = "/rest/ListeningQuestionSingle/{id}")
    public Object getListeningQuestion(@PathVariable("id") int id) {
        ListeningQuestion l1 = null;
        l1 = listeningQuestionService.selectByPrimaryKey(id);
        return l1;
    }

    @RequestMapping(value = "/rest/ListeningQuestionList")
    public Object getListeningQuestionList() {
        List<ListeningQuestion> listeningQuestions = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int temp = new Random().nextInt(100);//生成随机数
            listeningQuestions.add(listeningQuestionService.selectByPrimaryKey(i));
        }
        return listeningQuestions;
    }

}
