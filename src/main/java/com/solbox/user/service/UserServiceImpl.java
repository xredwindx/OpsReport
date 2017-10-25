package com.solbox.user.service;

import com.solbox.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by sichoon.kwon on 2017-10-25.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired private UserDao userDao;

    @Override
    public Map<String, Object> getCheckUser(Map<String, Object> inMap) {
        return userDao.getCheckUser(inMap);
    }
}
