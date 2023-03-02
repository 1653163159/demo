package com.example.demo.service;

import com.example.demo.pojo.Stack;

import java.util.List;

public interface StackService {
    public List<String> getAllBookName();

    public List<String> getBookNameByLevel(String level, int position);

    public List<Stack> getBookChapter(String bookName);
}
