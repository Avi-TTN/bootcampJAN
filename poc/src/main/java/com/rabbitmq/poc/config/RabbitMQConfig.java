package com.rabbitmq.poc.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue queue1(){
        return new Queue("demo_queue1");
    }

//    @Bean
//    public Queue queue2(){
//        return new Queue("demo_queue2");
//    }
//
//    @Bean
//    public Queue queue3(){
//        return new Queue("demo_queue3");
//    }
//
//
//    @Bean
//    public FanoutExchange fanoutExchange(){
//        return new FanoutExchange("demo_fanout_exchange");
//    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("demo_direct_exchange");
    }

    @Bean
    public Binding binding1(){
        return BindingBuilder
                .bind(queue1())
                .to(directExchange())
                .with("key1");
    }

    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }

//    @Bean
//    public Binding binding2(){
//        return BindingBuilder
//                .bind(queue2())
//                .to(directExchange())
//                .with("key2");
//    }
//
//    @Bean
//    public Binding binding3(){
//        return BindingBuilder
//                .bind(queue3())
//                .to(directExchange())
//                .with("key3");
//    }

//    @Bean
//    public Binding binding4() {
//        return BindingBuilder.bind(queue1()).to(fanoutExchange());
//    }
//
//    @Bean
//    public Binding binding5() {
//        return BindingBuilder.bind(queue2()).to(fanoutExchange());
//    }
//
//    @Bean
//    public Binding binding6() {
//        return BindingBuilder.bind(queue3()).to(fanoutExchange());
//    }
}
