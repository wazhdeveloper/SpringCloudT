package com.atguigu.springcloud.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import javax.xml.transform.Source;
import java.util.UUID;

/**
 * @author wzhstart
 * @creat 2022-09-23-19:56
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output; // 消息的发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        this.output.send(MessageBuilder.withPayload(serial).build()); // 创建并发送消息
        System.out.println("serial: " + serial);

        return serial;
    }
}
