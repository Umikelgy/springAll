package start.configuration;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2018/12/27 14:22
 */
public class RibbonFailedAnalyzer implements FailureAnalyzer {
    @Override
    public FailureAnalysis analyze(Throwable throwable) {
        return new FailureAnalysis("Ribbo Failed Message: ",throwable.getMessage(),throwable);
    }
}
