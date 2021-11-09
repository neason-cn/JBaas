package com.jbaas.infrastructure.spi.db;

import com.jbaas.infrastructure.spi.db.extension.Sequence;

import javax.sql.DataSource;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public interface DbAbility {

    DataSource getDataSource();

    Sequence getSequence(String sequenceName);

}
