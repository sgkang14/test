package com.ksg.openapi.dto;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.*;

import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserListData {

    private List<User> users;

    private Integer offset;

    private Integer limit;

    private Integer totalCount;
}
