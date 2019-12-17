package com.ksg.openapi.sample.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 강성근
 */
@Getter
@AllArgsConstructor
public enum EnumType {

    AAA("100", "AAA"),
    BBB("200", "BBB"),
    CCC("300", "CCC");

    private String code;

    private String name;
}

