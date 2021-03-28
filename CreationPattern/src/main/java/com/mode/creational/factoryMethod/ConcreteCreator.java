package com.mode.creational.factoryMethod;

/**
 * @author lijt
 */
public class ConcreteCreator implements Creator{

    @Override
    public ConcreteProduct factoryMethod() {
        return new ConcreteProduct();
    }
}
