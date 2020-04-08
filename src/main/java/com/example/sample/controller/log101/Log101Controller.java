package com.example.sample.controller.log101;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/log101")
public class Log101Controller {

    @RequestMapping(value = "init")
    public ModelAndView init(ModelAndView mav) {
        mav.setViewName("log101/log101");
        return mav;
    }
}