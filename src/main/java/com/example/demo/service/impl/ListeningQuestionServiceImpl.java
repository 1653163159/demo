package com.example.demo.service.impl;

import com.example.demo.dao.ListeningQuestionMapper;
import com.example.demo.pojo.ListeningQuestion;
import com.example.demo.service.ListeningQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListeningQuestionServiceImpl implements ListeningQuestionService {
    @Autowired
    private ListeningQuestionMapper listeningQuestionMapper;


    @Override
    public ListeningQuestion selectByPrimaryKey(int id) {
        return listeningQuestionMapper.selectByPrimaryKey(id);
    }
}
