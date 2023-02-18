package com.example.demo.service.impl;

import com.example.demo.dao.AudioBankMapper;
import com.example.demo.pojo.AudioBank;
import com.example.demo.service.AudioBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudioBankServiceImpl implements AudioBankService {
    @Autowired
    private AudioBankMapper audioBankMapper;

    @Override
    public AudioBank selectByPrimaryKey(Integer audioId) {
        return audioBankMapper.selectByPrimaryKey(audioId);
    }
}
