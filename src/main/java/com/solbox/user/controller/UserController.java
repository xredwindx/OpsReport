package com.solbox.user.controller;

import com.solbox.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sichoon.kwon on 2017-09-08.
 */
@Controller
public class UserController {
    @Autowired private UserDao userDao;

    @RequestMapping("/")
    public String start() {
        return login();
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/checkuser")
    public ResponseEntity<?> checkUser(HttpServletRequest req, HttpServletResponse res) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("test", "test");
        return new ResponseEntity<>(mv, HttpStatus.OK);
    }
}
