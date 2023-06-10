package com.team.hotel.commom;

import com.team.hotel.service.PaymentService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class AutoCallJob {
//
    @Autowired
    PaymentService paymentService;

    @Scheduled(cron = "0 0 12 * * ?")
    public void doTask(){
        paymentService.checkThePaymentByEndTime();
        System.out.println("定时任务执行了！");
    }
}
