package com.gaesenak.web;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Objects;

@SpringBootApplication
@MapperScan(value = {"com.gaesenak.web.mapper.TestUserMapper"})
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    /*
     * SqlSessionFactory 설정
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{

        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

        sessionFactory.setDataSource(dataSource);

        Resource[] arrResource = new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapper/*Mapper.xml");
        sessionFactory.setMapperLocations(arrResource);
        Objects.requireNonNull(sessionFactory.getObject()).getConfiguration().setMapUnderscoreToCamelCase(true);

        return sessionFactory.getObject();

    }

}
