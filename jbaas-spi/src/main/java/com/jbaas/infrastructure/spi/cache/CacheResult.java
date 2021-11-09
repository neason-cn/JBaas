package com.jbaas.infrastructure.spi.cache;

import java.io.Serializable;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public class CacheResult<T> implements Serializable {

    private static final long serialVersionUID = 2021011407170001L;

    private T result;

    public T getResult() {
        return this.result;
    }

}
