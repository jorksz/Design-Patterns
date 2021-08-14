package factoryMethod.rightThinks;


import factoryMethod.Product;

/**
 * @author lijt
 */
public abstract class AbstractCreator {

    /**
     * 声明获取 product 对象的接口
     *
     * @return
     */
    abstract Product factoryMethod();

    public void anOperation() {
        // 让子类决定创建哪个对象
        Product product = factoryMethod();
        //..........
    }
}
