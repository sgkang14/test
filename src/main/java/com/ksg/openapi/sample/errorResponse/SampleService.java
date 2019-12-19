package com.ksg.openapi.sample.errorResponse;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 강성근
 */
@Service
public class SampleService {

    private static Logger logger = (Logger) LoggerFactory.getLogger(SampleRequestDTO.class);

    public SampleResponseData query(SampleRequestDTO request) {

        logger.debug("### Service ### [{}]", request.toString());

        List<ResultVO> listResult = new ArrayList<ResultVO>();
        ResultVO result = new ResultVO();
        listResult.add(result);
        listResult.add(result);
        listResult.add(result);

        SampleResponseData data = new SampleResponseData();
        data.setUsers(listResult);

        data.getPage().setLimit(20);
        data.getPage().setOffset(3);

        return data;
    }

    public SampleResponseData byPass(SampleRequestDTO request) {

        logger.debug("### Service ### [{}]", request.toString());

        ResultVO result = new ResultVO(request);

        SampleResponseData data = new SampleResponseData();
        data.getUsers().add(result);

        data.getPage().setLimit(20);
        data.getPage().setOffset(1);

        return data;
    }
}
