package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2018/12/27 11:34
 */
@SpringBootApplication
public class Application {
    public static void main(String[]args){
//       System.setProperty("spring.devtools.restart.enabled","false");禁用自动重启
        SpringApplication.run(Application.class,args);
    }
}
