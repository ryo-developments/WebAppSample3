package com.example.sample.controller;

import com.example.sample.dto.GameInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class RestGameController {

    @RequestMapping(value = "/gameList", method = {RequestMethod.POST})
    @ResponseBody
    public List<GameInfo> gameInfoList(
            @RequestBody List<GameInfo> gameInfoList) {
        int num = 2;
        System.out.println(gameInfoList.get(num).getId());
        System.out.println(gameInfoList.get(num).getGameName());
        System.out.println(gameInfoList.get(num).getCompanyName());
        return gameInfoList;
    }
}
