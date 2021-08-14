package factoryMethod;

/**
 * @author lijt
 */
public class CreatorManager {

    private static volatile CreatorManager manager;

    public static final CreatorManager getInstance() {
        if (manager == null) {
            synchronized (CreatorManager.class) {
                if (manager == null) {
                    manager = new CreatorManager();
                }
            }
        }
        return manager;
    }


    public Creator getProductFactory(int index) {
        if (index == 1) {
            return new ConcreteCreator();
        }
        return null;
    }
}
