package com.example.sample.controller.log101;

import com.example.sample.form.log101.req.Log101LoginReqForm;
import com.example.sample.form.log101.res.Log101LoginResForm;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log101/rest")
public class log101RestController {

    @RequestMapping(value = "/login", method = { RequestMethod.POST })
    @ResponseBody
    public Log101LoginResForm login(@RequestBody Log101LoginReqForm log101LoginReqForm) {

        System.out.println(log101LoginReqForm.getId());
        System.out.println(log101LoginReqForm.getPassword());
        Log101LoginResForm log101LoginResForm = new Log101LoginResForm();
        return log101LoginResForm;
    }
}