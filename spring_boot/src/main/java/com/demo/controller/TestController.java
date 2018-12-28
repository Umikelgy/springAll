package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2018/12/28 10:08
 */
@RestController
public class TestController {
    @RequestMapping("tts")
    public String tts(){
        return "Test-hot swapping  mkl";
    }
    @RequestMapping("actuator")
    public String helloActuator(){
        return "Hello Spring Boot Actuator";
    }
}
