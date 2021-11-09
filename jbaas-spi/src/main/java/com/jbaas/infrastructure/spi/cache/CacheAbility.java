package com.jbaas.infrastructure.spi.cache;

import com.jbaas.infrastructure.spi.cache.domain.CacheResult;
import com.jbaas.infrastructure.spi.cache.extension.Lock;

import java.io.Serializable;
import java.util.List;

/**
 * Cache Ability Interface
 *
 * @author neason-cn
 * @date 2021/11/9
 */
public interface CacheAbility {

    CacheResult get(Serializable key);

    CacheResult put(Serializable key, Serializable value);

    CacheResult put(Serializable key, Serializable value, int expireTime);

    CacheResult delete(Serializable key);

    CacheResult mget(List<? extends Serializable> keys);

    CacheResult mdelete(List<? extends Serializable> keys);

    Lock getLock(Serializable key);
}
