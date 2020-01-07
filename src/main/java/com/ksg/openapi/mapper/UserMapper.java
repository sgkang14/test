package com.ksg.openapi.mapper;

import com.ksg.openapi.sample.errorResponse.SampleRequestDTO;
import com.ksg.openapi.sample.errorResponse.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 강성근
 */
@Mapper
@Repository
public interface UserMapper {

    List<UserVO> query(SampleRequestDTO request);
}
