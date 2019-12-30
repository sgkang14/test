package com.ksg.openapi.mapper;

import com.ksg.openapi.sample.errorResponse.SampleRequestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 강성근
 */
@Mapper
@Repository
public interface UserMapper {

    List query(SampleRequestDTO request);
}
