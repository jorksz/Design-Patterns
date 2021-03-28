package com.mode.creational.factoryMethod.rightThinks;

import com.mode.creational.factoryMethod.ConcreteProduct;
import com.mode.creational.factoryMethod.Product;

/**
 * @author lijt
 */
public class ConcreteCreatorB extends AbstractCreator {

    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }
}
