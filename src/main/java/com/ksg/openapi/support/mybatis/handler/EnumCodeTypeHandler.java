package com.ksg.openapi.support.mybatis.handler;

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

/**
 * Created by 강성근
 */
@Alias("EnumCodeTypeHandler")
public class EnumCodeTypeHandler<E extends EnumCode> extends BaseTypeHandler<E> {

    private static Logger logger = (Logger) LoggerFactory.getLogger(EnumCodeTypeHandler.class);

    private final Class<E> type;

    /**
     * Instantiates a new enum code handler.
     *
     * @param type the type
     */
    public EnumCodeTypeHandler(Class<E> type) {
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
