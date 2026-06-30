package com.example.cloud4cicd3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hi-cicd")

    public String  hi(){

        return  "  hi   cicd   ^^^^^";
    }


    @ResponseBody
    @GetMapping("/hi2")
    public String  hi2(){

        return  "  hi2   ^^^^^^^";
    }
}
