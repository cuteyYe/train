package com.jiawa.train.batch.job;

/**
 * 适合单体应用，不适合集群
 * 无法实时更改定时任务状态和策略
 */

//@EnableScheduling  //必须加上这个注解
//@Component
//public class SpringBootTestJob {
//
//    //每5秒执行一次
//    @Scheduled(cron = "0/5 * * * * ?")
//    private void test(){
//        //增加分布式锁解决集群问题
//        System.out.println("SpringBootTestJob Test");
//    }
//}
