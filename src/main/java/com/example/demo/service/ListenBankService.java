package com.example.demo.service;

import com.example.demo.pojo.ListenBank;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ListenBankService {
    public ListenBank getAudioById(int id);

    public List<ListenBank> getAudioListById();
}
