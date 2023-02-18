package com.example.demo.service;

import com.example.demo.pojo.AudioBank;

public interface AudioBankService {

    /*
     * 根据id查询音频
     * */
    AudioBank selectByPrimaryKey(Integer audioId);
}
