/**
 * Copyright ⓒ 2020 Bespin Global Co., Ltd. All rights reserved
 *
 * @project : lightsaber-external-openapi
 * @category : com.bespinglobal.external-openapi
 * @class : GlobalEnumCodeTypeHandler.java
 * @author : sunggeun.kang
 * @date : 2020. 01. 10 11:24
 * @description :
 */
package com.ksg.openapi.mapper.handler;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.common.code.EnumCode;
import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.slf4j.LoggerFactory;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Alias("GlobalEnumCodeTypeHandler")
public class GlobalEnumCodeTypeHandler <E extends EnumCode> extends BaseTypeHandler<E> {

    static final Logger logger = (Logger) LoggerFactory.getLogger(GlobalEnumCodeTypeHandler.class);
    private final Class<E> type;

    /**
     * Instantiates a new enum code handler.
     *
     * @param type the type
     */
    public GlobalEnumCodeTypeHandler(Class<E> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter,
                                    JdbcType jdbcType) throws SQLException {
        if (jdbcType == null) {
            ps.setString(i, parameter.getCode());
        } else {
            ps.setObject(i, parameter.getCode(), jdbcType.TYPE_CODE);
        }
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName)
            throws SQLException {
        final String code = rs.getString(columnName);
        return code == null ? null : getEnum(code);
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex)
            throws SQLException {
        final String code = rs.getString(columnIndex);
        return code == null ? null : getEnum(code);
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex)
            throws SQLException {
        final String code = cs.getString(columnIndex);
        return code == null ? null : getEnum(code);
    }

    /**
     * Gets the enum.
     *
     * @param code the code
     * @return the enum
     */
    private E getEnum(String code) {
        try {
            final E[] enumConstants = type.getEnumConstants();

            for (final E enumConstant : enumConstants) {
                if (enumConstant.getCode().equals( code )) {
                    return enumConstant;
                }
            }

            if (code != null) {
                logger.error("Not found enum constant! [" + code + "]");
            }
        } catch (final Exception e) {
            logger.error("type : " + type.getName());
            logger.error("EnumCodeHandler.getEnum(" + code + ")", e);
        }

        return null;
    }
}
