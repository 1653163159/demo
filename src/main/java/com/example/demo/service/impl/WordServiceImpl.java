package com.example.demo.service.impl;

import com.example.demo.dao.WordMapper;
import com.example.demo.pojo.Word;
import com.example.demo.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    WordMapper wordMapper;

    @Override
    public List<Word> getWordList(String level, int position) {
        return wordMapper.selectWordsByLevel(level, position);
    }
}
