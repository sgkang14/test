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
public enum SexType {

    MAN("100", "MAN"),
    WOMAN("200", "WOMAN");

    private String code;

    private String name;
}

