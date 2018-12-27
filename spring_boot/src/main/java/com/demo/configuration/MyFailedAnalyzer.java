package com.demo.configuration;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2018/12/27 11:39
 */
public class MyFailedAnalyzer implements FailureAnalyzer {
    @Override
    public FailureAnalysis analyze(Throwable throwable) {
        return new FailureAnalysis("My failed message: ",throwable.getMessage(),throwable);
    }

}
