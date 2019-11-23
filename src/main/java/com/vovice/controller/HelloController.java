package com.vovice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.PseudoColumnUsage;

//控制器类
@Controller
@RequestMapping(path = "/user")//设置上级访问路径
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello SpringMVC");
        return "success";//
    }

    /**
     *value可以e和path作用相同，value可以省略
     * @return
     * ,method = {RequestMethod.POST}
     */
    @RequestMapping(path="/testRequestMapping",params = "username=haha")
    public String testRequestMapping(){
        System.out.println("测试@RequestMapping注解");
        return "success";
    }
}
