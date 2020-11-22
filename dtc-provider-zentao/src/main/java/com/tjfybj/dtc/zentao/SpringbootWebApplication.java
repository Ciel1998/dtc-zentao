package com.tjfybj.dtc.zentao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2020/11/19 15:55
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
@EnableSwagger2
@SpringBootApplication
public class SpringbootWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.tjfybj.dtc.zentao.SpringbootWebApplication.class, args);
    }
}
