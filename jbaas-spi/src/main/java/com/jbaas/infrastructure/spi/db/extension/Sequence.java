package com.jbaas.infrastructure.spi.db.extension;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public interface Sequence {

    String getName();

    long next();

    long next(int size);

}
