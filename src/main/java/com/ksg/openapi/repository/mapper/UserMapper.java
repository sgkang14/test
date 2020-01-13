package com.ksg.openapi.repository.mapper;

import com.ksg.openapi.dto.SampleRequestDTO;
import com.ksg.openapi.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 강성근
 */
@Mapper
@Repository
public interface UserMapper {

    List<User> query(SampleRequestDTO request);
}
