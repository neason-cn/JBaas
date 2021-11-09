package com.jbaas.infrastructure.spi.cache.domain;

import java.io.Serializable;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public interface CacheResult<T> extends Serializable {

    long serialVersionUID = 2021011407170001L;

    T getResult();

}
