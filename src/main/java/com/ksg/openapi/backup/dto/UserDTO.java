package com.ksg.openapi.backup.dto;

import com.ksg.openapi.backup.common.HobbyType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by 강성근
 */
@ToString
public class UserDTO {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private HobbyType[] hobby;

}
