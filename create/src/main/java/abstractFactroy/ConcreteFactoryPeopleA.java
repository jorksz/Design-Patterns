package abstractFactroy;

/**
 * 实现创建具体产品对象 -people1 的操作
 * @author lijt
 */
public class ConcreteFactoryPeopleA extends AbstractFactoryDemo{

    private static volatile ConcreteFactoryPeopleA FACTORY_MANAGER;

    private ConcreteFactoryPeopleA() {

    }

    public static ConcreteFactoryPeopleA INSTANCE() {
        if (FACTORY_MANAGER == null) {
            synchronized (MainFactory.class) {
                if (FACTORY_MANAGER == null) {
                    FACTORY_MANAGER = new ConcreteFactoryPeopleA();
                }
            }
        }
        return FACTORY_MANAGER;
    }


    @Override
    public AbstractProductEat getEat() {
        return new ConcreteProductEat();
    }

    @Override
    public AbstractProductPlay getPlay() {
        return new ConcreteProductPlay();
    }
}
