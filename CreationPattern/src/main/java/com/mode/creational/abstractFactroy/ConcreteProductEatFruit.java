package com.mode.creational.abstractFactroy;

/**
 *
 * @author lijt
 */
public class ConcreteProductEatFruit extends AbstractProductEat{

    @Override
    public void eat() {
        System.out.println("我正在吃水果");
    }
}
