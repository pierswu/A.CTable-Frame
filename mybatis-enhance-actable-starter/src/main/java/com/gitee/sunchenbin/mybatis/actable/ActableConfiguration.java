package com.gitee.sunchenbin.mybatis.actable;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: piers-wu
 * @create: 2020-07-16 10:14
 **/
@Configuration
@ComponentScan("com.gitee.sunchenbin.mybatis.actable.manager.*")
@MapperScan("com.gitee.sunchenbin.mybatis.actable.dao.*")
public class ActableConfiguration {
}
