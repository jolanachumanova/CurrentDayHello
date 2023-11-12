package com.hello.currentdayhello.service.impl;

import com.hello.currentdayhello.service.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Value("${greeting.message}")
    private String message;

    @Override
    public Mono<String> getGreeting() {
        return Mono.just(message);
    }
}
