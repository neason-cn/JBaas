package com.jbaas.infrastructure.spi.mq.domain;

import java.util.List;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public interface MessageListener {

    void onReceived(List<Message> messages);

}