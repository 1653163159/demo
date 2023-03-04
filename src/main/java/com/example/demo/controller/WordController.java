package com.example.demo.controller;

import com.example.demo.pojo.Word;
import com.example.demo.service.WordService;
import com.example.demo.tools.Flags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WordController {
    @Autowired
    WordService wordService;

    @RequestMapping(value = "/rest/getWordList/{level}/{position}")
    public Object getBookNameByLevel(@PathVariable("level") String level, @PathVariable("position") int position) {
        return wordService.getWordList(level, position);
    }
    @RequestMapping(value = "/rest/getWordList/{level}")
    public Object getWordsByLevelR(@PathVariable("level") String level) {
        Random random = new Random();
        int maxCount = 30;
        switch (level) {
            case Flags.INTERMEDIATE:
                maxCount = Flags.WORD_INTERMEDIATE_COUNT;
                break;
            case Flags.ADVANCED:
                maxCount = Flags.WORD_ADVANCED_COUNT;
                break;
            case Flags.BEGINNER:
            default:
                maxCount = Flags.WORD_BEGINNER_COUNT;
        }
        int position = random.nextInt(maxCount);
        if (position > maxCount - 10) {
            position -= 10;
        }
        return wordService.getWordList(level, position);
    }
}
