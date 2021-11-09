package com.jbaas.infrastructure.spi.mq.domain;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public interface QueueSelector {

    int select(int total, Message message, Object context);

}
