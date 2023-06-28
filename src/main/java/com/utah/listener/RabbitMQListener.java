package com.utah.listener;

import cn.hutool.json.JSONUtil;
import com.rabbitmq.client.Channel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

/**
 * MQ监听器
 *
 * @author: zhutianwei
 * @create: 2022/07/14
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class RabbitMQListener {


    /**
     * 监听CCP文件上传，异步处理上传文件
     *
     * @return
     */
//    @Bean(value = "ccp-upload-update")
    public Consumer<Message<byte[]>> receiveCcpUploadMessage() {
        return t -> {
            Channel channel = t.getHeaders().get(AmqpHeaders.CHANNEL, Channel.class);
            Long deliverTag = t.getHeaders().get(AmqpHeaders.DELIVERY_TAG, Long.class);
            Boolean redelivered = t.getHeaders().get(AmqpHeaders.REDELIVERED, Boolean.class);
            try {
                String message = new String(t.getPayload(), StandardCharsets.UTF_8);
                log.info("receiveCcpUploadMessage: receive message {}", message);
                CorrelationData correlationData = JSONUtil.toBean(message, CorrelationData.class);
                channel.basicAck(deliverTag, false);
            } catch (Exception e) {
                log.error("receiveCcpUploadMessage handle error : {}", e.getMessage(), e);
                try {
                    if (redelivered == null || !redelivered) {
                        //重新投递mq
                        channel.basicNack(deliverTag, false, true);
                    } else {
                        channel.basicReject(deliverTag, false);
                    }
                } catch (IOException ioe) {
                    log.error("basicReject/basicNack error : {}", e.getMessage(), e);
                }
            }
        };
    }
}
