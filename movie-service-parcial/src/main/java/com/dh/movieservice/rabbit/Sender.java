package com.dh.movieservice.rabbit;

import com.dh.movieservice.domain.model.Movie;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    private final RabbitTemplate rabbitTemplate;
    @Value("${queue.movies}")
    private String moviesQueue;

    public Sender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(Movie movie) {
        // TODO: add resillience4j for retries with exponential backoff
        rabbitTemplate.convertAndSend(this.moviesQueue, movie);
    }
}
