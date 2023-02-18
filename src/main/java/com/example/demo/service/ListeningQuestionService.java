package com.example.demo.service;

import com.example.demo.pojo.ListeningQuestion;

public interface ListeningQuestionService {
    /*
     * 根据id查询题目
     * */
    ListeningQuestion selectByPrimaryKey(int id);
}
