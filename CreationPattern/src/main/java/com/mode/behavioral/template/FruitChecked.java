package com.mode.behavioral.template;

/**
 * 水果检查类
 * @author lijt
 */
public class FruitChecked extends AbstractCheck {

    @Override
    public boolean check() {
        System.out.println("水果没坏");
        return true;
    }
}
