/**
 * @Author mlsong
 * @Date 2019/9/12 0012
 * @Description
 */
package com.itek.teaching.management.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: teaching-management
 * @description: springboot配置
 * @author: mlsong
 * @create: 2019-09-12 14:00
 **/
@Configuration
public class SpringBootConfiguration implements WebMvcConfigurer {

    /**
     * 地址映射
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/calendar").setViewName("fullcalendar");
        registry.addViewController("/evalTeach").setViewName("teachingEvaluation");
    }
}
