//package com.ksg.openapi.config;
//
//import com.ksg.openapi.sample.errorResponse.HobbyType;
//import com.ksg.openapi.sample.errorResponse.SexType;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.type.BooleanTypeHandler;
//import org.apache.ibatis.type.TypeHandler;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
///**
// * Created by 강성근
// */
//@Configuration
//@MapperScan(basePackages = {"com.ksg.openapi.mapper"})
//public class MybatisConfig {
//
//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource);
//        sessionFactoryBean.setTypeAliasesPackage("com.ksg.openapi.sample.errorResponse");
//        sessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis-config.xml"));
//        sessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:sql/*.xml"));
//        sessionFactoryBean.setTypeHandlers(new TypeHandler[] {
//                new BooleanTypeHandler(),
//                new HobbyType.HobbyTypeHandler(),
//                new SexType.SexTypeHandler()
//        });
//
//        return sessionFactoryBean.getObject();
//    }
//
//}
