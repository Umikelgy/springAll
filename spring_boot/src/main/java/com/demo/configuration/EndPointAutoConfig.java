package com.demo.configuration;

import com.demo.controller.MyEndPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2018/12/28 17:24
 */
@Configuration
public class EndPointAutoConfig {
    @Bean
    public MyEndPoint myEndPoint(){
        return new MyEndPoint();
    }
}
