package com.example.demo.controller;

import com.example.demo.dao.TestDao;
import com.forman.foundation.library.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.forman.foundation.library.RedisUtil.get;

/**
 * Created by Administrator on 2019/9/3.
 */
@Controller
@RequestMapping("/api/v1")
public class testController {
    @Autowired
    private TestDao testDao;
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String test(Model model)
    {
        String values = testDao.getConfig("yuliu1");
        model.addAttribute("word", values);//1232136565698989
        String redis_test = RedisUtil.get(0,"test");
        System.out.println(redis_test);
        return "test";
    }
}
