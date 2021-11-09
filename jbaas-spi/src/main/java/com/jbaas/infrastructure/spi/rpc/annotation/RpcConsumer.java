package com.jbaas.infrastructure.spi.rpc.annotation;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public @interface RpcConsumer {

    String group();

    String version();

    int timeout();

}
