package com.ksg.openapi.dto;

import lombok.ToString;

/**
 * Created by 강성근
 */
@ToString
public class ListData {

    private Integer offset;

    private Integer limit;

    private Integer totalCount;
}
