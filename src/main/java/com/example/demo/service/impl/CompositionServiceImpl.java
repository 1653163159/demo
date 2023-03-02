package com.example.demo.service.impl;

import com.example.demo.dao.CompositionMapper;
import com.example.demo.pojo.Composition;
import com.example.demo.service.CompositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompositionServiceImpl implements CompositionService {
    @Autowired
    CompositionMapper compositionMapper;

    @Override
    public List<Composition> getCompositionList() {
        return compositionMapper.selectAll();
    }
}
