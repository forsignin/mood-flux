package com.mood.flux.utils;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//@ApiModel(description = "返回示例")
public class ResponseExample implements Serializable{
//    @ApiModelProperty(value = "返回状态码1为成功，其他为失败",example = "1",notes = "返回状态码1为成功，其他为失败",dataType = "String")
    private String statusCode;
//    @ApiModelProperty(value = "返回数据",example = "object",notes = "返回对象",dataType = "Object")
    private Object data;
//    @ApiModelProperty(value = "返回信息",example = "success",notes = "返回信息",dataType = "String")
    private String message;

    public ResponseExample() {
    }

    public ResponseExample(String statusCode, Object data, String message) {
        this.statusCode = statusCode;
        this.data = data;
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public ResponseExample setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResponseExample setData(Object data) {
        this.data = data;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseExample setMessage(String message) {
        this.message = message;
        return this;
    }

    public static ResponseExample create() {
        return new ResponseExample();
    }
}
