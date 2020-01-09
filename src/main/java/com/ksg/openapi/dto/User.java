package com.ksg.openapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksg.openapi.common.code.HobbyCode;
import com.ksg.openapi.common.code.SexCode;
import lombok.*;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by 강성근
 */
@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Alias("User")
public class User {

    private Integer no;

    private SexCode sex;

    private String name;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date regDt;

    private HobbyCode hobby;

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (Exception e) {
            return "";
        }
    }
}
