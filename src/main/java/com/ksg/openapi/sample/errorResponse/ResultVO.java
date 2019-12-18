package com.ksg.openapi.sample.errorResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO {

    private Integer no;

    private String name;

    private Date dt;

    private EnumType en;

    private List<EnumType> ens;

    private ClassType cl;

    private List<ClassType> cls;

    public ResultVO(SampleRequestDTO request) {
        this.no = request.getNo();
        this.dt = request.getDt();
        this.en = request.getEn();
        this.ens = request.getEns();
        this.cl = request.getCl();
        this.cls = request.getCls();
    }
}
