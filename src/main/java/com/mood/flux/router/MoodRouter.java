package com.mood.flux.router;

import com.mood.flux.handler.MoodHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Created by mood on 2018/7/14.
 */
//@Configuration
public class MoodRouter {

    @Bean
    public RouterFunction<ServerResponse> routeMood(MoodHandler moodHandler){
        return RouterFunctions.route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),moodHandler::hello);
    }
}
