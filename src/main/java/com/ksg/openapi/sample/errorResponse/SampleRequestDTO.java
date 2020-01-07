package com.ksg.openapi.sample.errorResponse;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@Setter
@Alias("SampleRequestDTO")
public class SampleRequestDTO {

    private Integer no;

    private SexType sex;

    private String name;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date regDt;

    private List<HobbyType> hobbys;

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
