package com.vovice.controller;

import com.vovice.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {
    /**
     * 请求参数绑定
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String userName){
        System.out.println("执行了》》》");
        System.out.println("你的用户名"+userName);
        return  "success";
    }

    /**
     * 把数据封装到java bean中
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了》》》");
        System.out.println(account);
        return  "success";
    }




}
