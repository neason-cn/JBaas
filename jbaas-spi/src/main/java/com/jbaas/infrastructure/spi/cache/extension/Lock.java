package com.jbaas.infrastructure.spi.cache.extension;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public interface Lock {

    Boolean lock();

    Boolean unlock();

}
