package com.example.demo.controller;

import com.example.demo.pojo.ListenBank;
import com.example.demo.service.ListenBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.io.IOException;

@RestController
public class ListenBankController {
    @Autowired
    ListenBankService listenBankService;

    @RequestMapping(value = "/rest/ListenAudio/{id}")
    public Object getListenAudio(@PathVariable("id") int id) throws IOException {
        ListenBank listen = null;
        listen = listenBankService.getAudioById(id);
        FileOutputStream fileOutputStream = new FileOutputStream("a.jpg");
        fileOutputStream.write(listen.getPicture());
        fileOutputStream.close();
        return listen;
    }
}
