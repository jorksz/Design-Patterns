package com.abstractFactroy;

/**
 * 抽象工厂 demo
 *
 * 举个例子
 * 每人都涉及到了吃和玩，但具体怎么吃和怎么玩每个人都有可能有不同的行为  人就相当于一个产品族，而吃和玩就相当于里面的产品。
 *
 * @author lijt
 */
public abstract class AbstractFactoryDemo {

    /**
     * 获取吃对象
     * @return
     */
    public abstract AbstractProductEat getEat();

    /**
     * 获取玩对象
     * @return
     */
    public abstract AbstractProductPlay getPlay();
}
