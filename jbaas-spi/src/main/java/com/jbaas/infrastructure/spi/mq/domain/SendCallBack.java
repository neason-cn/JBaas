package com.jbaas.infrastructure.spi.mq.domain;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public interface SendCallBack {

    void onSuccess(final String messageId);

    void onException(final Throwable e);

}