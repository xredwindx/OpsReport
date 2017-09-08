package com.solbox.user.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by sichoon.kwon on 2017-09-08.
 */
@Mapper
public interface UserDao {
    List<Map<String, Object>> getUserList();
}
