package com.jbaas.infrastructure.spi.config;

import com.jbaas.infrastructure.spi.config.domain.ConfigListener;

import java.util.List;

/**
 * Config Ability Interface
 *
 * @author neason-cn
 * @date 2021/11/9
 */
public interface ConfigAbility {

    String get(String dataId, String group, long timeout);

    Boolean publist(String dataId, String group, String content);

    Boolean remove(String dataId, String group);

    void addListener(String dataId, String group, ConfigListener listener);

    void removeListener(String dataId, String group, ConfigListener listener);

    List<ConfigListener> getListeners(String dataId, String group);

}
