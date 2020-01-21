package com.ksg.openapi.repository.handler;

import com.ksg.openapi.common.code.HobbyCode;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.stereotype.Component;

/**
 * Created by 강성근
 */
@MappedTypes(HobbyCode.class)
@Component
public class HobbyCodeTypeHandler extends EnumCodeTypeHandler<HobbyCode> {

    public HobbyCodeTypeHandler() {
        super(HobbyCode.class);
    }

}
