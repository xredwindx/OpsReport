package com.solbox.user.controller;

import com.solbox.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by sichoon.kwon on 2017-09-08.
 */
@Controller
public class UserController {
    @Autowired private UserDao userDao;

    @RequestMapping("/")
    public String getUserList(HttpServletRequest req, HttpServletResponse res, Model model) {
        List<Map<String, Object>> list = userDao.getUserList();
        model.addAttribute("user", list);
        return "test";
    }
}
