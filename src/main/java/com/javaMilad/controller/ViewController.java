package com.javaMilad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/helloJava")
    public String redirect(){
        return  "viewPage" ;
    }

    @RequestMapping("/helloagain")
    public String display(){
        return "finalPage" ;
    }



}
