package com.mode.creational.factoryMethod;

/**
 * @author lijt
 */
public interface Creator {

    /**
     * 重定义工厂方法，返回一个 ConcreteProduct 实例
     *
     * @return
     */
    ConcreteProduct factoryMethod();
}
