package com.example.demo.controller;

import com.example.demo.pojo.Hsk;
import com.example.demo.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

@RestController
public class ExamController {
    @Autowired
    ExamService examService;

    @RequestMapping(value = "/rest/exam/{level}")
    public Object getExamByLevel(@PathVariable("level") int level) throws IOException {
        List<Hsk> examList = examService.selectAllByLevel(level);
        /*FileOutputStream fileOutputStream = new FileOutputStream("a.json");
        fileOutputStream.write(examList.get(0).getContent());
        fileOutputStream.close();
        BufferedReader fileInputStream = new BufferedReader(new InputStreamReader(new FileInputStream("a.json"), "GBK"));
        StringBuilder builder = new StringBuilder();
        int ch;
        new String();
        while ((ch = fileInputStream.read()) != -1) {
            builder.append((char) ch);
        }
        String result = builder.toString();
        //result = result.substring(1, result.length() - 1);
        fileInputStream.close();*/
        return examList;
    }

}
