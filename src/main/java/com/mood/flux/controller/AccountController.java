package com.mood.flux.controller;

import com.mood.flux.entity.KAccount;
import com.mood.flux.service.AccountService;
import com.mood.flux.utils.ResponseExample;
import com.mood.flux.utils.RsaUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpCookie;
import org.springframework.http.ResponseCookie;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;


/**
 * Created by mood on 2018/7/15.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    private Logger logger = LoggerFactory.getLogger(AccountController.class);
    @Autowired
    private AccountService accountService;
    String s = "TS_ozbAIv8PqGhMgzzCOyhaYvu9QGkY_1538214521000";
    @GetMapping("/all")
    public Flux<KAccount> all(ServerHttpResponse response){
        return Flux.create(accountFlux ->{
            accountService.selectList(new KAccount()).forEach(account -> accountFlux.next(account));

            String code = RsaUtils.encryptByPublic(s.getBytes(), null);

            response.addCookie(ResponseCookie.from("authCode",code).path("/").maxAge(Duration.ofDays(7)).build());
            accountFlux.complete();
        });
    }
    @GetMapping("/list")
    public Mono<ResponseExample> list(ServerHttpRequest request){
        return Mono.create(l -> {
            MultiValueMap<String, HttpCookie> cookies = request.getCookies();
            List<HttpCookie> authCode = cookies.get("authCode");
            authCode.forEach(code -> {
                String result = RsaUtils.decryptByPrivate(code.getValue(), null);
                if(s.equals(result)){
                    logger.info("授权成功");
                }
            });
            l.success(new ResponseExample("1",accountService.selectList(new KAccount()),"success"));}
        );
    }
}
