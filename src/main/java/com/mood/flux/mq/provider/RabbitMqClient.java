package com.mood.flux.mq.provider;

import com.mood.flux.mq.ExchangeEnum;
import com.mood.flux.mq.QueueEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: mood
 * @Date: 2018/11/5 15:16
 * @Description:
 */
@Component
public class RabbitMqClient {
    private Logger LOG = LoggerFactory.getLogger(RabbitMqClient.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String msg ) {
        rabbitTemplate.convertAndSend(ExchangeEnum.USER_REGISTER_TOPIC_EXCHANGE.getName(),QueueEnum.USER_REGISTER_SEND_MAIL.getRoutingKey(),msg);
        LOG.info("发送消息 msg={}",msg);
    }
}
