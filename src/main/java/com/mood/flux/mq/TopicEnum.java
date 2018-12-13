package com.mood.flux.mq;
/**
 * @Auther: mood
 * @Date: 2018/11/5 14:43
 * @Description:
 */
public enum  TopicEnum {
    /**
     * 用户注册topic路由key配置
     */
    USER_REGISTER("register.user");

    private String topicRouteKey;

    TopicEnum(String topicRouteKey) {
        this.topicRouteKey = topicRouteKey;
    }

    public String getTopicRouteKey() {
        return topicRouteKey;
    }
}
