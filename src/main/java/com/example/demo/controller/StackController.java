package com.example.demo.controller;

import com.example.demo.service.StackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StackController {
    @Autowired
    StackService stackService;

    @RequestMapping(value = "/rest/getBookNameByLevel/{level}/{position}")
    public Object getBookNameByLevel(@PathVariable("level") String level, @PathVariable("position") int position) {
        return stackService.getBookNameByLevel(level, position);
    }

    @RequestMapping(value = "/rest/getChapterList/{bookname}")
    public Object getChapter(@PathVariable("bookname") String bookname) {
        return stackService.getBookChapter(bookname);
    }
}