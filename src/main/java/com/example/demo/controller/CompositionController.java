package com.example.demo.controller;

import com.example.demo.pojo.Composition;
import com.example.demo.service.CompositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompositionController {
    @Autowired
    CompositionService compositionService;
}
