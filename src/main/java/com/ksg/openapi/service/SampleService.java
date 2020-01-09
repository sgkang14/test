package com.ksg.openapi.service;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.dto.ResponseDTO;
import com.ksg.openapi.dto.SampleRequestDTO;
import com.ksg.openapi.dto.User;
import com.ksg.openapi.mapper.UserMapper;
import com.ksg.openapi.dto.SampleResponseData;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 강성근
 */
@Service
public class SampleService {

    private static Logger logger = (Logger) LoggerFactory.getLogger(SampleRequestDTO.class);

    @Autowired
    UserMapper userMapper;

    public SampleResponseData query(SampleRequestDTO request) {

        SampleResponseData data = new SampleResponseData();
        data.setUsers(userMapper.query(request));

        for (User user : data.getUsers()) {
            logger.debug("### hobby : [{}]", user.getHobby().getValue());
        }

        ResponseDTO<SampleResponseData> response = new ResponseDTO<SampleResponseData>();
        response.setData(data);

        return data;
    }
}
