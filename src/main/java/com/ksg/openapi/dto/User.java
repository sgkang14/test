package com.ksg.openapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ksg.openapi.common.code.SexCode;
import lombok.*;
import org.apache.ibatis.type.Alias;

import java.util.Date;
import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@Setter
@Alias("User")
public class User {

    private Integer no;

    private String name;

    private SexCode sex;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date regDt;

    private List<Hobby> hobbies;
}
