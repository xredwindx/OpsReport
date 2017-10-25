package com.solbox.user.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * Created by sichoon.kwon on 2017-09-08.
 */
@Mapper
public interface UserDao {
    Map<String, Object> getCheckUser(Map<String, Object> inMap);
}
