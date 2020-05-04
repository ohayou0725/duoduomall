package com.ohayou.duoduomall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liyan
 * @date 2020/5/4 下午1:17
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ohayou.duoduomall.product.dao")
public class DuoduomallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(DuoduomallProductApplication.class,args);
    }
}
