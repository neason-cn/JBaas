package com.jbaas.infrastructure.spi.rpc;

import com.jbaas.infrastructure.spi.rpc.domain.Service;

/**
 * RPC Ability Interface
 *
 * @author neason-cn
 * @date 2021/11/9
 */
public interface RpcAbility {

    void publish(Service service);

    <T> T get(Service<T> service);

}
