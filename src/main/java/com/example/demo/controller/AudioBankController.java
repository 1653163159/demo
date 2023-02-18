package com.example.demo.controller;

import com.example.demo.pojo.AudioBank;
import com.example.demo.service.AudioBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


@RestController
public class AudioBankController {

    @Autowired
    AudioBankService audioBankService;

    @RequestMapping(value = "/rest/AudioBankSingle/{id}")
    public Object getListeningQuestion(@PathVariable("id") int id) throws IOException {
        AudioBank a1 = null;
        a1 = audioBankService.selectByPrimaryKey(id);
        byte[] bytes = a1.getAudio_content();
        /*String str=Base64.getEncoder().encodeToString(bytes);
        //使用Map返回字符串Json
        Map<String,Object> m1=new HashMap<>();
        m1.put("id",a1.getId());
        m1.put("type",a1.getType());
        m1.put("audio_name",a1.getAudio_name());
        m1.put("audio_content",str);*/
        return a1;
    }

    @RequestMapping(value = "/rest/AudioBankList")
    public Object getListeningQuestionList() {
        List<AudioBank> AudioBanks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int temp = new Random().nextInt(100);//生成随机数
            AudioBanks.add(audioBankService.selectByPrimaryKey(i));
        }
        return AudioBanks;
    }
}
