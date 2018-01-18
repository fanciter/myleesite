package com.fanciter.myleesite.module.sys.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 登录控制器
 * <p>Title:LoginController</p>
 * <p>Description: </p>
 *
 * @author  fanciter
 * @version 1.0.0
 * @create  2018/1/18 0018 下午 5:26
 **/
@Controller
public class LoginController {

    /**
     * 跳转登录页
     */
    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public String login() {

        return "modules/sys/login";
    }
}