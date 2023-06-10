//package com.team.hotel.config;
//
//import org.quartz.Scheduler;
//import org.quartz.SchedulerException;
//import org.quartz.impl.StdSchedulerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class QuartzConfig {
//
//    @Bean
//    public Scheduler scheduler() throws SchedulerException {
//        StdSchedulerFactory factory = new StdSchedulerFactory();
//        Scheduler scheduler = factory.getScheduler();
//        scheduler.start();
//        System.out.println("定时任务调度器状态：" + scheduler.getSchedulerName() + " - " + scheduler.getMetaData().getThreadPoolSize());
//        return scheduler;
//    }
//}