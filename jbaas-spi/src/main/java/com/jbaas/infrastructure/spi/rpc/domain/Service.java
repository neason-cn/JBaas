package com.jbaas.infrastructure.spi.rpc.domain;

import java.io.Serializable;

/**
 * Service Wrapper
 *
 * @author neason-cn
 * @date 2021/11/9
 */
public class Service<T> implements Serializable {

    private static final long serialVersionUID = 2021011407170002L;

    private String interfaceName;

    private Class<T> interfaceClass;

    private T tagert;

    private String version;

    private String group;

    private Integer timeout;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public Class<T> getInterfaceClass() {
        return interfaceClass;
    }

    public void setInterfaceClass(Class<T> interfaceClass) {
        this.interfaceClass = interfaceClass;
    }

    public T getTagert() {
        return tagert;
    }

    public void setTagert(T tagert) {
        this.tagert = tagert;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}
