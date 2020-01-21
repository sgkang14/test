package com.ksg.openapi.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by 강성근
 */
@Mapper
@Repository
public interface CommonMapper {

    void selectDatabase(String name);
}
