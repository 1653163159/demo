package com.example.demo.service;

import com.example.demo.pojo.Hsk;

import java.util.List;

public interface ExamService {
    public List<Hsk> selectAllByLevel(int i);

    public Hsk getExam(String id);
}
