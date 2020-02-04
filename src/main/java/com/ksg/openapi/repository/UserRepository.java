package com.ksg.openapi.repository;

import com.ksg.openapi.dto.UserListRequestDTO;
import com.ksg.openapi.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 강성근
 */
@Repository
public interface UserRepository {

    List<User> query(UserListRequestDTO request);
}
