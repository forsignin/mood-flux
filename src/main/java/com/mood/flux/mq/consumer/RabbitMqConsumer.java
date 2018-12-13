package com.mood.flux.mq.consumer;

import com.mood.flux.mq.QueueEnum;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: mood
 * @Date: 2018/11/5 15:34
 * @Description:
 */
@Component
public class RabbitMqConsumer {
    @RabbitListener(queues = {"register.account","register.mail"})
    public void receive(String message) {
        System.out.println("收到的 message 是：" + message);
    }
}
