package com.ksg.openapi.repository.handler;

import com.ksg.openapi.common.code.EnumCode;
import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeException;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 강성근
 */
@Alias("EnumCodeTypeHandler")
public class EnumCodeTypeHandler<E extends Enum <E>> implements TypeHandler<EnumCode> {

    private Class<E> type;

    public EnumCodeTypeHandler(Class<E> type) {
        this.type = type;
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, EnumCode parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setString(i, parameter.getCode());
    }

    @Override
    public EnumCode getResult(ResultSet rs, String columnName) throws SQLException {
        return getCodeEnum(rs.getString(columnName));
    }

    @Override
    public EnumCode getResult(ResultSet rs, int columnIndex) throws SQLException {
        return getCodeEnum(rs.getString(columnIndex));
    }

    @Override
    public EnumCode getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return getCodeEnum(cs.getString(columnIndex));
    }

    private EnumCode getCodeEnum(String code) {
        try {
            EnumCode[] enumConstants = (EnumCode[]) type.getEnumConstants();
            for (EnumCode codeNum: enumConstants) {
                if (codeNum.getCode().equals(code)) {
                    return codeNum;
                }
            }
            return null;
        } catch (Exception e) {
            throw new TypeException("Can't make enum object '" + type + "'", e);
        }
    }
}