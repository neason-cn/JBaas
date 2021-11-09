package com.jbaas.infrastructure.spi.file;

import com.jbaas.infrastructure.spi.file.domain.FileDescription;

import java.io.File;
import java.io.InputStream;

/**
 * File Ability Interface
 *
 * @author neason-cn
 * @date 2021/11/9
 */
public interface FileAlibity {

    boolean save(File file, FileDescription description);

    boolean save(InputStream inputStream, FileDescription description);

    InputStream read(FileDescription description);

    File read(FileDescription description, String localPath);

    boolean delete(FileDescription description);

    boolean isExsits(FileDescription description);

}
