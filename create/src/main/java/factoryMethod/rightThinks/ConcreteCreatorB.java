package factoryMethod.rightThinks;


import factoryMethod.ConcreteProduct;
import factoryMethod.Product;

/**
 * @author lijt
 */
public class ConcreteCreatorB extends AbstractCreator {

    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }
}
