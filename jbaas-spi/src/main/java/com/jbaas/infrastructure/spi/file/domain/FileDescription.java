package com.jbaas.infrastructure.spi.file.domain;

import java.util.Date;

/**
 * @author neason-cn
 * @date 2021/11/9
 */
public interface FileDescription {

    String getFileName();

    String getRelativePath();

    String suffix();

    String getLocaltion();

    Date getModifiedTime();

    boolean needUnzip();

}
