package com.ksg.openapi.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by 강성근
 */
//@Mapper
@Repository
public interface CommonRepository {

    void selectDatabase(String name);
}
