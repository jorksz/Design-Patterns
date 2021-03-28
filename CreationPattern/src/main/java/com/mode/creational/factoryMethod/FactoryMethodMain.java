package com.mode.creational.factoryMethod;

/**
 * @author lijt
 */
public class FactoryMethodMain {

    public static void main(String[] args) {
        Creator creator = CreatorManager.getInstance().getProductFactory(1);
        if (creator instanceof ConcreteCreator) {
            Product product = creator.factoryMethod();
        }
    }
}
