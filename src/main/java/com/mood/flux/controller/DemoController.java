package com.mood.flux.controller;

import com.mood.flux.entity.User;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by mood on 2018/7/14.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    static List<String> list = new ArrayList<>();
    static {

        list.add("a");
        list.add("b");
    }
    @GetMapping("/hello/{id}")
    public Mono<String> hello(@PathVariable("id") Long id){
        return Mono.create(l ->l.success(list.get(id.intValue())));
    }

    @GetMapping("/all")
    public Flux<Object> all() {
        return Flux.create(f -> {
            list.forEach(i -> f.next(i));
            f.complete();
        });
    }
}
