package com.atguigu.yygh.hosp.kafka;

import com.atguigu.yygh.hosp.service.ScheduleService;
import com.atguigu.yygh.model.hosp.Schedule;
import com.atguigu.yygh.model.message.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author zwen
 * @Description
 * @create 2022-01-27 9:21 下午
 */

@Component
public class KafkaConsumer {

    @Autowired
    private ScheduleService scheduleService;

    @KafkaListener(topics = {"quickstart-events"})

    public void listen(ConsumerRecord<String, String> record) {
        System.out.println(record.value() + "fuck");
    }


}
