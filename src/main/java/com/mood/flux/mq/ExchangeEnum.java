 package com.mood.flux.mq;
/**
 * @Auther: mood
 * @Date: 2018/11/5 14:30
 * @Description:
 */
public enum ExchangeEnum {
    /**
     * 用户注册交换配置枚举
     */
    USER_REGISTER_TOPIC_EXCHANGE("register.topic.exchange");
    private String name;

    ExchangeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
