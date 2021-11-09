package com.jbaas.infrastructure.spi.mq.domain;

import java.util.Properties;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public interface Message {

    String getTopic();

    String getSubTopic();

    byte[] getData();

    Properties getProperties();

}
