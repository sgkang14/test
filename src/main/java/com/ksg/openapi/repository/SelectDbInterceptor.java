//package com.ksg.openapi.repository;
//
//import ch.qos.logback.classic.Logger;
//import org.apache.ibatis.executor.Executor;
//import org.apache.ibatis.mapping.MappedStatement;
//import org.apache.ibatis.plugin.*;
//import org.apache.ibatis.session.ResultHandler;
//import org.apache.ibatis.session.RowBounds;
//import org.slf4j.LoggerFactory;
//
//import java.util.Properties;
//
///**
// * Created by 강성근
// */
//@Intercepts({
//        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
//        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})
//})
//public class SelectDbInterceptor implements Interceptor {
//
//    static final Logger logger = (Logger) LoggerFactory.getLogger(SelectDbInterceptor.class);
//    private Properties properties;
//
//    @Override
//    public Object intercept(Invocation invocation) throws Throwable {
//
//        Object[] args = invocation.getArgs();
//        MappedStatement ms = (MappedStatement)args[0];
//        Object param = (Object)args[1];
//
//        logger.debug("### intercept param [{}]", param);
//
//        Object result = invocation.proceed();
//
//        return result;
//    }
//
//    @Override
//    public Object plugin(Object target) {
//        return Plugin.wrap(target, this);
//    }
//
//    @Override
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }
//
//
//
//}
