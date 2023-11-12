package com.hello.currentdayhello.service;

import reactor.core.publisher.Mono;

public interface GreetingService {
    Mono<String> getGreeting();
}
