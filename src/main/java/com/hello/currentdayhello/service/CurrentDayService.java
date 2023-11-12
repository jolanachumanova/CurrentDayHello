package com.hello.currentdayhello.service;

import reactor.core.publisher.Mono;

public interface CurrentDayService {
    Mono<String> getCurrentDay();
}
