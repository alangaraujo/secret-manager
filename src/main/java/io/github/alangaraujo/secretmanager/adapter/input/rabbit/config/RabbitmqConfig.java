package io.github.alangaraujo.secretmanager.adapter.input.rabbit.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

//    @Bean
//    public RabbitTemplate rabbitTemplate(final ConnectionFactory connectionFactory,
//                                         final MessageConverter messageConverter) {
//
//        final var rabbitTemplate = new RabbitTemplate(connectionFactory);
//        rabbitTemplate.setMessageConverter(messageConverter);
//        return rabbitTemplate;
//    }

    @Bean
    public MessageConverter jackson2JsonMessageConverter(final ObjectMapper mapper) {
        return new Jackson2JsonMessageConverter(mapper);
    }
}
