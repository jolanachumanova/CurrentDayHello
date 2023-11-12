package com.hello.currentdayhello.service.impl;

import com.hello.currentdayhello.service.CurrentDayService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Service
public class CurrentDayServiceImpl implements CurrentDayService {

    @Override
    public Mono<String> getCurrentDay() {
        return Mono.just(LocalDate.now().getDayOfWeek().name());
    }

}
