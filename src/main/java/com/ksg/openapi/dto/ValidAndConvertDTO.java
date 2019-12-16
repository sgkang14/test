package com.ksg.openapi.dto;

import ch.qos.logback.classic.Logger;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.Pattern;

/**
 * Created by 강성근
 */
public class ValidAndConvertDTO {

    static final Logger logger = (Logger) LoggerFactory.getLogger(ValidAndConvertDTO.class);

    @Getter @Setter
    private String name;

    @Getter @Setter
    @Pattern(regexp = "work|play")
    private String hobby;

    /* foreach 를 통해 valid 체크는 가능하나 convert 가 안됨... ㅜㅡ */

/*
    public void validAndConvert() {
        for (String h : this.hobby) {
            logger.debug("h:{}", HobbyType.valueOf(h.toUpperCase()).getCode());
            h = HobbyType.valueOf(h.toUpperCase()).getCode();
        }
    }
*/
    @Override
    public String toString() {
        return String.format("%s %s", name, hobby);
    }
}
