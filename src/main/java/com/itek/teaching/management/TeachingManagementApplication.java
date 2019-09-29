package com.itek.teaching.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.itek.teaching.management.dao")
@EnableTransactionManagement

/**
 * @title 教学管理应用
 * @author mlsong
 */
public class TeachingManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachingManagementApplication.class, args);
    }
}
