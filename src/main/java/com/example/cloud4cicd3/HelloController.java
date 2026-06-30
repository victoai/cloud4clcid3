package com.example.cloud4cicd3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hi-cicd")

    public String  hi(){

        return  "hi  cicd docker !!!  ^^^ !!! 1215 ";
    }
}
