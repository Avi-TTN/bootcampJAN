package com.rabbitmq.poc.controller;

import com.rabbitmq.poc.dto.Car;
import com.rabbitmq.poc.service.RabbitMQProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/rabbitmq")
@RequiredArgsConstructor
public class RabbitMQController {

    private final RabbitMQProducer rabbitMQProducer;

    @PostMapping("publish")
    public ResponseEntity<String> publish(@RequestBody Car car, @RequestParam String key){
        rabbitMQProducer.sendMessage(car, key);
        return ResponseEntity.ok("Published Message -> " + car + " | with key : " + key);
    }

//    @GetMapping("publish/fanout")
//    public ResponseEntity<String> publishFanout(@RequestParam String msg){
//        rabbitMQProducer.sendMessageFanout(msg);
//        return ResponseEntity.ok("Published Message Fanout -> " + msg);
//    }
}
