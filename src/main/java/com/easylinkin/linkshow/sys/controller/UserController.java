package com.easylinkin.linkshow.sys.controller;

import com.easylinkin.linkshow.sys.entity.User;
import com.easylinkin.linkshow.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * UserController
 * <p>
 * 功能:用户管理controller
 *
 * <pre>
 * ver     修订日              作者           修订内容
 * 1.0     2019/1/10           沈磊           新规做成
 * </pre>
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/userList")
    public ModelAndView userList(User user){
        ModelAndView mav = new ModelAndView();
        List<User> userList = userService.getUserList(user);
        mav.addObject("userList",userList);
        mav.setViewName("/index");
        return mav;
    }
}
