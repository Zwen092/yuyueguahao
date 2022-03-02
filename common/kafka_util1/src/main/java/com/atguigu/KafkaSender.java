package com.atguigu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

/**
 * @author zwen
 * @Description
 * @create 2022-01-29 10:46 上午
 */
@Service
@Slf4j
public class KafkaSender {


    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaSender(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void send(String s) {
//        com.atguigu.Message message = new com.atguigu.Message();
//
//        message.setId(System.currentTimeMillis());
//        message.setMsg(msg);
//        message.setSendTime(new Date());
//        log.info("【++++++++++++++++++ message ：{}】", gson.toJson(message));
        //对 topic =  hello2 的发送消息
        ListenableFuture<SendResult<String, String>> listenableFuture = kafkaTemplate.send("quickstart-events", s);

    }


}
