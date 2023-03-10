package com.example.demo.controller;

import com.example.demo.service.StackService;
import com.example.demo.tools.Flags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class StackController {
    @Autowired
    StackService stackService;

    @RequestMapping(value = "/rest/getBookNameByLevel/{level}/{position}")
    public Object getBookNameByLevel(@PathVariable("level") String level, @PathVariable("position") int position) {
        return stackService.getBookNameByLevel(level, position);
    }

    @RequestMapping(value = "/rest/getBookNameByLevel/{level}")
    public Object getBookNameByLevelR(@PathVariable("level") String level) {
        Random random = new Random();
        int maxCount = 30;
        switch (level) {
            case Flags.INTERMEDIATE:
                maxCount = Flags.STACK_INTERMEDIATE_COUNT;
                break;
            case Flags.ADVANCED:
                maxCount = Flags.STACK_ADVANCED_COUNT;
                break;
            case Flags.BEGINNER:
            default:
                maxCount = Flags.STACK_BEGINNER_COUNT;
        }
        int position = random.nextInt(maxCount);
        if (position > maxCount - 10) {
            position -= 10;
        }
        return stackService.getBookNameByLevel(level, position);
    }

    @RequestMapping(value = "/rest/getChapterList/{bookname}")
    public Object getChapter(@PathVariable("bookname") String bookname) {
        return stackService.getBookChapter(bookname);
    }
}