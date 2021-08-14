package abstractFactroy;


/**
 * 定义一个将被相应的具体工厂创建的产品对象
 * 也就是实现 吃 这个抽象接口
 * @author lijt
 */
public class ConcreteProductEat extends AbstractProductEat{
    @Override
    public void eat() {
        System.out.println("我正在吃饭");
    }
}
