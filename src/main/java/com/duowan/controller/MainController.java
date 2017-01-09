package com.duowan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zengjie on 17/1/9.
 */

@Controller
public class MainController {

    @RequestMapping("/doLogin")
    public ModelAndView doLogin(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("user","zengjie");
        mv.setViewName("/login");
        return mv;
    }
}
