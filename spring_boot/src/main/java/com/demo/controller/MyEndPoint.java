package com.demo.controller;

import com.demo.entity.MemInfo;
import org.springframework.boot.actuate.endpoint.Endpoint;

import java.time.LocalDateTime;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2018/12/28 16:48
 */
public class MyEndPoint implements Endpoint<MemInfo> {

    /**
     *@description
     *  getID是EndPoint的唯一标识
     *  MVC接口对外暴露的路径：http://localhost:8080/myendpoint;
     *@param
     *@return
     *@anthor  10068921
     */
    @Override
    public String getId() {
        return "myendpoint";
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isSensitive() {
        return false;
    }

    @Override
    public MemInfo invoke() {
        Runtime runtime=Runtime.getRuntime();
        return MemInfo.newBuild()
                .nowTime(LocalDateTime.now())
                .maxMemory(runtime.maxMemory())
                .totalMemory(runtime.totalMemory())
                .build();
    }
}
