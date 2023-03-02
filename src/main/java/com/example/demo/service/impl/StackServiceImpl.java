package com.example.demo.service.impl;

import com.example.demo.dao.StackMapper;
import com.example.demo.pojo.Stack;
import com.example.demo.service.StackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StackServiceImpl implements StackService {
    @Autowired
    StackMapper stackMapper;

    @Override
    public List<String> getAllBookName() {
        return stackMapper.selectAllBookName();
    }

    @Override
    public List<String> getBookNameByLevel(String level, int position) {
        return stackMapper.selectBookNameByLevel(level, position);
    }

    @Override
    public List<Stack> getBookChapter(String bookName) {
        return stackMapper.selectBookChapter(bookName);
    }
}
