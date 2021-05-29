package com.mode.creational.Singleton;

/**
 * 双检锁实现单例，保证线程安全
 * @author lijt
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    /**
     * 不提供构造方法
     */
    private DoubleCheckSingleton() {}

    /**
     * 同一提供获取对象的静态方法
     *
     * @return DoubleCheckSingleton {@link DoubleCheckSingleton} 对象
     */
    public static DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

}
