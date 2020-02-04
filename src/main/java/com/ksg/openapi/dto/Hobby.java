package com.ksg.openapi.dto;

import com.ksg.openapi.common.code.HobbyCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

/**
 * Created by 강성근
 */
@Setter
@Getter
@Alias("Hobby")
public class Hobby {

    private Integer hobbyNo;

    private HobbyCode hobbyCode;

//    private String hobbyCode;
}
