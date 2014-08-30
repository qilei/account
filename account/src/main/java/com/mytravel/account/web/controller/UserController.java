package com.mytravel.account.web.controller;

import com.mytravel.account.domain.User;
import com.mytravel.account.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qilei on 2014/8/29.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping({"/", "/index"})
    public String index(Model model) {
        List<User> users = userService.getAll();
        model.addAttribute("users", users);
        return "userList";
    }
}
