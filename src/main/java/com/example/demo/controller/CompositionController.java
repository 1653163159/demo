package com.example.demo.controller;

import com.example.demo.service.CompositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompositionController {
    @Autowired
    CompositionService compositionService;

    @RequestMapping(value = "/rest/composition")
    public Object getCAll() {
        return compositionService.getCompositionAll();
    }

    @RequestMapping(value = "/rest/composition/{level}/{position}")
    public Object getCList(@PathVariable("level") String level, @PathVariable("position") int position) {
        return compositionService.getCompositionList(level, position);
    }
}
