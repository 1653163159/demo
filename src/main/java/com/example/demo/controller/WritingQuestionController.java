package com.example.demo.controller;

import com.example.demo.pojo.AudioBank;
import com.example.demo.pojo.PictureBank;
import com.example.demo.service.PictureBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WritingQuestionController {
    @Autowired
    private PictureBankService pictureBankService;
    @RequestMapping(value = "/rest/HandwritingResourceSingle/{id}")
    public Object getListeningQuestion(@PathVariable("id") int id) throws IOException {
        PictureBank p1 = null;
        p1 = pictureBankService.selectByPrimaryKey(id);
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/HQX/Downloads/"+p1.getPicture_name()+".jpg");
        byte[] bytes= p1.getPicture_content();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
        return p1;
    }

    @RequestMapping(value = "/rest/HandwritingResourceSingleList")
    public Object getListeningQuestionList() {
        List<PictureBank> pictureBanks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int temp = new Random().nextInt(100);//生成随机数
            pictureBanks.add(pictureBankService.selectByPrimaryKey(i));
        }
        return pictureBanks;
    }

}
