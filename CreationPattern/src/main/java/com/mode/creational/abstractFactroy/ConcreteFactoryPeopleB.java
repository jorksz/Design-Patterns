package com.mode.creational.abstractFactroy;

/**
 * 实现创建具体产品对象的操作 -玩
 * @author lijt
 */
public class ConcreteFactoryPeopleB extends AbstractFactoryDemo{

    private static volatile ConcreteFactoryPeopleB CONCRETE_FACTORY_PLAY = null;

    private ConcreteFactoryPeopleB() {

    }

    public static ConcreteFactoryPeopleB INSTANCE() {
        if (CONCRETE_FACTORY_PLAY == null) {
            synchronized (MainFactory.class) {
                if (CONCRETE_FACTORY_PLAY == null) {
                    CONCRETE_FACTORY_PLAY = new ConcreteFactoryPeopleB();
                }
            }
        }
        return CONCRETE_FACTORY_PLAY;
    }

    @Override
    public AbstractProductEat getEat() {
        return new ConcreteProductEatFruit();
    }

    @Override
    public AbstractProductPlay getPlay() {
        return new ConcreteProductPlayWater();
    }
}
