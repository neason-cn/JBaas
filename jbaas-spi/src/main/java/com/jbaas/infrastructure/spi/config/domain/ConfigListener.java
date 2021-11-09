package com.jbaas.infrastructure.spi.config.domain;

/**
 * Config Listener
 *
 * @author neason-cn
 * @date 2021/11/9
 */
public interface ConfigListener {

    /**
     * execute when config changes
     *
     * @param config remote config value
     */
    void receive(final String config);

}
