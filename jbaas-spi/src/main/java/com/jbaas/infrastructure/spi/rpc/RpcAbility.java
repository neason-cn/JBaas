package com.jbaas.infrastructure.spi.rpc;

import com.jbaas.infrastructure.spi.rpc.domain.RpcService;

/**
 * RPC Ability Interface
 *
 * @author neason-cn
 * @date 2021/11/9
 */
public interface RpcAbility {

    void publish(RpcService service);

    <T> T get(RpcService<T> service);

}
