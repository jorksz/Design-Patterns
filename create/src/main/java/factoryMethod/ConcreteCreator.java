package factoryMethod;

/**
 * @author lijt
 */
public class ConcreteCreator implements Creator{

    public ConcreteProduct factoryMethod() {
        return new ConcreteProduct();
    }
}
