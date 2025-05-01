package com.rabbitmq.poc.service;

import com.rabbitmq.poc.dto.Car;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RabbitMQProducer {

    private final RabbitTemplate rabbitTemplate;

    public void sendMessage(Car car, String key){
        log. info("Sent Msg Direct -> {} | on queue with key : {}", car, key);
        rabbitTemplate.convertAndSend("demo_direct_exchange", key, car);
    }
//
//    public void sendMessageFanout(String message){
//        log. info("Sent Msg Fanout-> {} | Fanout Mode", message);
//        rabbitTemplate.convertAndSend("demo_fanout_exchange", "", message);
//    }
}
