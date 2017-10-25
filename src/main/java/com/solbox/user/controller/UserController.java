package com.solbox.user.controller;

import com.solbox.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sichoon.kwon on 2017-09-08.
 */
@Controller
public class UserController {
    @Autowired private UserService userService;

    @RequestMapping("/")
    public String start() {
        return login();
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/checkuser")
    public ResponseEntity<?> checkUser(HttpServletRequest req, HttpServletResponse res, HttpSession session) {
        String uid = req.getParameter("uid");

        Map<String, Object> inMap = new HashMap<>();
        inMap.put("uid", uid);
        inMap.put("pwd", req.getParameter("pwd"));

        Map<String, Object> userInfo = userService.getCheckUser(inMap);

        ModelAndView mv = new ModelAndView();
        if(userInfo.size() > 0) {
            session.setAttribute("user", uid);
            mv.setViewName("main");
        } else {
            mv.setViewName("login");
        }

        return new ResponseEntity<>(mv, HttpStatus.OK);
    }
}
