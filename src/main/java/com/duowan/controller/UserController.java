package com.duowan.controller;

import com.alibaba.fastjson.JSONObject;
import com.duowan.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zengjie on 17/5/10.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("list")
    @ResponseBody
    public  JSONObject list(){
        JSONObject json=new JSONObject();
        List<User> users=new ArrayList<>();
        json.put("data",users);
        return json;
    }
}
