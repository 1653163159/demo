package com.example.demo.service.impl;

import com.example.demo.dao.ListenBankMapper;
import com.example.demo.pojo.ListenBank;
import com.example.demo.service.ListenBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ListenBankServiceImpl implements ListenBankService {
    @Autowired
    ListenBankMapper listenBankMapper;

    @Override
    public ListenBank getAudioById(int id) {
        return listenBankMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ListenBank> getAudioListById() {
        List<ListenBank> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(10) + 1;
            list.add(listenBankMapper.selectByPrimaryKey(num));
        }
        return list;
    }
}
