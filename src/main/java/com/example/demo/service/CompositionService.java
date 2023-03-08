package com.example.demo.service;

import com.example.demo.pojo.Composition;

import java.util.List;

public interface CompositionService {
    public List<Composition> getCompositionAll();

    public List<Composition> getCompositionList(String level, int position);
}
