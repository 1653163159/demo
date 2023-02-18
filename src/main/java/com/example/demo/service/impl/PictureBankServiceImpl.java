package com.example.demo.service.impl;

import com.example.demo.dao.PictureBankMapper;
import com.example.demo.pojo.PictureBank;
import com.example.demo.service.PictureBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureBankServiceImpl implements PictureBankService {
    @Autowired
    private PictureBankMapper pictureBankMapper;

    @Override
    public PictureBank selectByPrimaryKey(int id) {
        return pictureBankMapper.selectByPrimaryKey(id);
    }
}
