package com.mode.creational.abstractFactroy;

/**
 * 工厂实例管理
 * @author lijt
 */
public class MainFactory {

    public static void main(String[] args) {
        ConcreteFactoryPeopleA.INSTANCE().getEat().eat();
        ConcreteFactoryPeopleA.INSTANCE().getPlay().play();
        ConcreteFactoryPeopleB.INSTANCE().getEat().eat();
        ConcreteFactoryPeopleB.INSTANCE().getPlay().play();
    }
}
