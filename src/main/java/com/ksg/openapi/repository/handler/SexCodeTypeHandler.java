package com.ksg.openapi.repository.handler;

import com.ksg.openapi.common.code.SexCode;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.stereotype.Component;

/**
 * Created by 강성근
 */
@MappedTypes(SexCode.class)
@Component
public class SexCodeTypeHandler extends EnumCodeTypeHandler<SexCode> {

    public SexCodeTypeHandler() {
        super(SexCode.class);
    }

}
