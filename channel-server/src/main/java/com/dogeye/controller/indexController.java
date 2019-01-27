package com.dogeye.controller;

import com.dogeye.pojo.ComicInfo;
import com.dogeye.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class indexController {

    @Autowired
    ComicService comicService;

    @RequestMapping("/index")
    String getIndex()
    {
        return "index";
    }

    @RequestMapping("/login")
    String login()
    {
        return "login";
    }

    @RequestMapping("/comic")
    String comic(@RequestParam("cid")Integer cid, Model model)
    {
        Optional<ComicInfo> comicInfoOptional = Optional.ofNullable(comicService.findOne(cid));
        comicInfoOptional.ifPresent(comicInfo -> model.addAttribute("comicInfo", comicInfo));
        return "comic";
    }

}
