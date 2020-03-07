package com.example.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

    @RequestMapping(value = "open")
    public ModelAndView open(ModelAndView mav) {
        mav.setViewName("gameList");
        return mav;
    }
}
