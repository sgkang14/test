package com.ksg.openapi.sample.errorResponse;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.mapper.UserMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

        ResponseDTO<SampleResponseData> response = new ResponseDTO<SampleResponseData>();
        response.setData(data);

        return data;
    }
}
