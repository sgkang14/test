package com.ksg.openapi.sample.errorResponse;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@Setter
@ToString
public class SampleRequestDTO {

    private Integer no;

    private Date dt;

    private EnumType en;

    private List<EnumType> ens;

    private ClassType cl;

    private List<ClassType> cls;
}
