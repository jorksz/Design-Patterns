package com.abstractFactroy;


/**
 * 定义一个将被相应的具体工厂创建的产品对象
 * 也就是实现 玩 这个抽象接口
 * @author lijt
 */
public class ConcreteProductPlay extends AbstractProductPlay{
    @Override
    public void play() {
        System.out.println("我正在玩电脑");
    }
}
