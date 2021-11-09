package com.jbaas.infrastructure.spi.rpc.domain;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public interface RpcService<T> {

    String getInterfaceName();

    Class<T> getInterfaceClass();

    T getServiceTarget();

    String getVersion();

    String getGroup();

    Integer getTimeout();

}
