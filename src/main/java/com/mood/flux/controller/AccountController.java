package com.mood.flux.controller;

import com.mood.flux.entity.KAccount;
import com.mood.flux.service.AccountService;
import com.mood.flux.utils.ResponseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Created by mood on 2018/7/15.
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/all")
    public Flux<KAccount> all(){
        return Flux.create(accountFlux ->{
            accountService.selectList(new KAccount()).forEach(account -> accountFlux.next(account));
            accountFlux.complete();
        });
    }
    @GetMapping("/list")
    public Mono<ResponseExample> list(){
        return Mono.create(l -> l.success(new ResponseExample("1",accountService.selectList(new KAccount()),"success")));
    }
}
