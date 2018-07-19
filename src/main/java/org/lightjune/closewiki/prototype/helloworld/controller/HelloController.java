package org.lightjune.closewiki.prototype.helloworld.controller;

import org.lightjune.closewiki.prototype.helloworld.dataservice.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private HelloRepository helloRepository;

    @Autowired
    public HelloController(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @GetMapping("/hello.do")
    public String getHello(Model model) {

        model.addAttribute("hello", helloRepository.getHello());

        return "hello.jsp";
    }
}
