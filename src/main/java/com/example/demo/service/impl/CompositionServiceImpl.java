package com.example.demo.service.impl;

import com.example.demo.dao.CompositionMapper;
import com.example.demo.pojo.Composition;
import com.example.demo.service.CompositionService;
import com.example.demo.tools.Flags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CompositionServiceImpl implements CompositionService {
    @Autowired
    CompositionMapper compositionMapper;

    @Override
    public List<Composition> getCompositionAll() {
        Random random = new Random();
        int i = random.nextInt(Flags.COMPOSITION_COUNT);
        if (i > Flags.COMPOSITION_COUNT - 5)
            i -= 5;
        return compositionMapper.selectCList(i);
    }

    @Override
    public List<Composition> getCompositionList(String level, int position) {
        return compositionMapper.selectCList(position);
    }
}
