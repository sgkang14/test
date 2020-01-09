package com.ksg.openapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksg.openapi.common.code.HobbyCode;
import com.ksg.openapi.common.code.SexCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import javax.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;



/**
 * Created by 강성근
 */
@Getter
@Setter
@Alias("SampleRequestDTO")
public class SampleRequestDTO {

    @NotNull
    private Integer no;

    private SexCode sex;

    private String name;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date regDt;

    private List<HobbyCode> hobbys;

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
