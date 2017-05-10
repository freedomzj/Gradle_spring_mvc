package com.duowan.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zengjie on 17/1/9.
 */

@Controller
public class MainController {

    @RequestMapping("/doLogin")
    public ModelAndView doLogin(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv=new ModelAndView();
        mv.addObject("user","zengjie");
        mv.setViewName("/login");
        return mv;
    }
    @RequestMapping({"/",""})
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("user","zengjie");
        mv.setViewName("/main");
        return mv;
    }
    @RequestMapping("json")
    @ResponseBody
    public  JSONObject json(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("aaa","111");
        jsonObject.put("bbb","怎解绝?");
        return jsonObject;
    }

}
