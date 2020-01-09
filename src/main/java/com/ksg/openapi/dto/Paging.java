package com.ksg.openapi.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by 강성근
 */
@Getter
@Setter
@NoArgsConstructor
public class Paging {

    private Integer limit;

    private Integer offset;
}
