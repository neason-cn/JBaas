package com.jbaas.infrastructure.spi.mq;

import com.jbaas.infrastructure.spi.mq.domain.Message;
import com.jbaas.infrastructure.spi.mq.domain.MessageListener;
import com.jbaas.infrastructure.spi.mq.domain.QueueSelector;
import com.jbaas.infrastructure.spi.mq.domain.SendCallBack;

import java.util.List;
import java.util.Set;

/**
 * Queue Ability Interface
 *
 * @author neason-cn
 * @date 2021/11/9
 */
public interface QueueAbility {

    String send(Message message);

    String send(Message message, QueueSelector selector, Object context);

    void asyncSend(Message message, SendCallBack callBack);

    void subscribe(String topic, Set<String> subTopics, MessageListener listener);

    void subscribe(String topic, String subExpression, MessageListener listener);

    List<Message> pull(String topic, String subExpression);

    String getProduceGroup();

    String getConsumerGroup();

}
