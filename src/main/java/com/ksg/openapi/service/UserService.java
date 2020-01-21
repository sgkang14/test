package com.ksg.openapi.service;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.dto.User;
import com.ksg.openapi.dto.UserListData;
import com.ksg.openapi.dto.UserListRequestDTO;
import com.ksg.openapi.repository.mapper.UserMapper;
import org.modelmapper.ModelMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 강성근
 */
@Service
public class UserService {

    private static Logger logger = (Logger) LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserMapper userMapper;

    public UserListData queryUserList(UserListRequestDTO request) {

        UserListData data = new UserListData();
        data.setUsers(userMapper.query(request));

        return data;
    }

}
