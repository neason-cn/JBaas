package com.jbaas.infrastructure.spi.mq.annotation;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public @interface MessageConsumer {

    String topic();

    String[] subTopics();

    String subExpression();

}
