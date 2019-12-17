package com.ksg.openapi.backup.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by 강성근
 */
@ToString
public class HealthCheckReqDTO {

    @Getter @Setter
    private int id;

    @Getter @Setter
    private String[] flag;

    @Getter @Setter
    private int age;
}
