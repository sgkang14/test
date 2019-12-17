package com.ksg.openapi.sample.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@AllArgsConstructor
public class ResultVO {

    private Integer no;

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
