package com.example.springbootmybatis.controll;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControl {

    @RequestMapping("/student")
    public String student(Model m) {
//        m.addAttribute("name", "thymeleaf");
        return "student/student";
    }

    @RequestMapping("/hello")
    public String hello(Model m) {
//        m.addAttribute("name", "thymeleaf");
        return "hello";
    }
}
