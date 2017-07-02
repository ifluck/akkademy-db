package com.akkademy;

import akka.actor.AbstractActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;
import com.akkademy.messages.SetRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/2.
 */
public class AkkademyDb extends AbstractActor {
    protected final LoggingAdapter log= Logging.getLogger(context().system(),this);
    protected final Map<String,Object> map =new HashMap<>();

    private AkkademyDb(){
        receive(ReceiveBuilder.match(SetRequest.class,message -> {
                log.info("接收到请求信息{}",message);
                map.put(message.getKey(),message.getValue());
                })
                .matchAny(o -> log.info("未知消息{}",o))
                .build()
        );
    }
}
