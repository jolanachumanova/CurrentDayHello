package com.hello.currentdayhello.rest;

import com.hello.currentdayhello.service.CurrentDayService;
import com.hello.currentdayhello.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class CurrentDayHelloController {

    private final GreetingService greetingService;
    private final CurrentDayService currentDayService;

    @GetMapping(value = "/currentDay")
    public ResponseEntity<String> getCurrentDayWithGreeting(){
        return Mono.zip(greetingService.getGreeting(), currentDayService.getCurrentDay())
                .map(text -> text.getT1() + text.getT2())
                .map(ResponseEntity::ok)
                .block();
    }
}
