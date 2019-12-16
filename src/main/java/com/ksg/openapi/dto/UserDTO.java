package com.ksg.openapi.dto;

import com.ksg.openapi.common.HobbyType;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by 강성근
 */
public class UserDTO {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private HobbyType hobby;

    @Override
    public String toString() {
        return String.format("%s %s", name, hobby);
    }
}
