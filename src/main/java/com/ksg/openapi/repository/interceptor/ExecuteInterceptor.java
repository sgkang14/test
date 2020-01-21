package com.ksg.openapi.repository.interceptor;

import ch.qos.logback.classic.Logger;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * Created by 강성근
 */

@Intercepts({ @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})
            , @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})
            , @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class})})
@Component
public class ExecuteInterceptor implements Interceptor {

    private static Logger logger = (Logger) LoggerFactory.getLogger(ExecuteInterceptor.class);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        logger.debug("### ExecuteInterceptor");

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        // TODO Auto-generated method stub

    }
}
