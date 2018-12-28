package com.demo.entity;

import java.time.LocalDateTime;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2018/12/28 16:43
 */
public class MemInfo {
    private LocalDateTime nowTime;
 /**
  *    //最大内存
  * */
    private long maxMemory;

    /**
     *进程当时所占用的所有内存
     * */
    private long totalMemory;

    public MemInfo(Build build) {
        nowTime=build.nowTime;
        maxMemory=build.maxMemory;
        totalMemory=build.totalMemory;
    }

    public LocalDateTime getNowTime() {
        return nowTime;
    }

    public long getMaxMemory() {
        return maxMemory;
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    public static Build newBuild(){
       return new Build();
    }
  public  static class Build{
        private LocalDateTime nowTime;
        private long maxMemory;
        private long totalMemory;

        public Build nowTime(LocalDateTime nowTime){
            this.nowTime=nowTime;
            return this;
        }
       public Build maxMemory(long maxMemory){
            this.maxMemory=maxMemory;
            return this;
        }
       public Build totalMemory(long totalMemory){
            this.totalMemory=totalMemory;
            return this;
        }
       public MemInfo build(){
            return new MemInfo(this);

        }
    }


}
