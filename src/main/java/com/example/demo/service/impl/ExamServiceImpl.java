package com.example.demo.service.impl;

import com.example.demo.dao.HskMapper;
import com.example.demo.pojo.Hsk;
import com.example.demo.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    private HskMapper hskMapper;

    @Override
    public List<Hsk> selectAllByLevel(int i) {
        return hskMapper.selectAllByLevel(i);
    }

    @Override
    public Hsk getExam(String id) {
        return hskMapper.selectByPrimaryKey(id);
    }
}
