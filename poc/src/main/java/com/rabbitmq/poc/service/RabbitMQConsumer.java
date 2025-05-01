package com.rabbitmq.poc.service;

import com.rabbitmq.poc.dto.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQConsumer {

    @RabbitListener(queues = {"demo_queue1"})
    public void consumer1(Car car) throws InterruptedException {
        Thread.sleep(15000);
        log.info("Message consumed by Queue 1->  {}", car);
    }
//
//    @RabbitListener(queues = {"demo_queue2"})
//    public void consumer2(String msg) throws InterruptedException {
//        Thread.sleep(5000);
//        log.info("Message consumed by Queue 2 ->  {}", msg);
//    }
//
//    @RabbitListener(queues = {"demo_queue3"})
//    public void consumer3(String msg) throws InterruptedException {
//        Thread.sleep(5000);
//        log.info("Message consumed by Queue 3 ->  {}", msg);
//    }
}
