package com.mode.behavioral.template;

/**
 * 简单例子，--检查机制
 * 假定对于物品需要经过检查之后才会卖给别人，那么对于不同的物品检查方面也会有所不同，具体的相关特性我们可以抽离出一个方法 {@link AbstractCheck #check}
 * 子类各自实现自身的特性检查机制，抽象类只需根据检查是否合格来决定是否卖给别人。
 * 这里只是简单举个例子，而实际上应该有对应的算法去做专门的判断。
 * @author lijt
 */
public abstract class AbstractCheck {

    /**
     * 具体的检查方法实现，
     * @return
     */
    public abstract boolean check();

    /**
     * 需要注意的是，这里如果不想被子类重写，就需要定义为一个 final ,很多时候子类并不需要重写这一个算法流程
     */
    public final void sell() {
        if (check()) {
            System.out.println("sell yes");
        } else {
            System.out.println("im sorry");
        }
    }
}
