package com.mood.mq;

import com.mood.flux.MoodFluxApplication;
import com.mood.flux.mq.provider.RabbitMqClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Auther: mood
 * @Date: 2018/11/5 14:57
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MoodFluxApplication.class)
//@SpringBootConfiguration
public class MqTest {
    @Resource(name = "rabbitMqClient")
    private RabbitMqClient rabbitMqClient;
    @Test
    public void test01(){
        rabbitMqClient.send("xxxx");
    }
}
