package com.ksg.openapi.sample.errorResponse;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.backup.service.HealthCheckService;
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

    public SampleResponseDTO query(SampleRequestDTO request) {

        logger.debug("### Service ### [{}]", request.toString());

        List<ResultVO> listResultVO = new ArrayList<ResultVO>();

        ResultVO result = new ResultVO();
        result.setNo(0);
        result.setName("aaa");
        listResultVO.add(result);
        result.setNo(1);
        result.setName("bbb");
        listResultVO.add(result);
        result.setNo(2);
        result.setName("ccc");
        listResultVO.add(result);

        ListData<ResultVO> listData = new ListData<ResultVO>();

        listData.setData(listResultVO);

        Paging paging = new Paging();
        paging.setOffset("1");
        paging.setLimit("2");

        listData.setPaging(paging);

        SampleResponseDTO<ListData> response = new SampleResponseDTO<ListData>();
        response.setData(listData);

        return response;
    }
}
