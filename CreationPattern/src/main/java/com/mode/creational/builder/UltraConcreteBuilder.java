package com.mode.creational.builder;

/**
 * UltraBuilder 实现类
 *
 * @author lijt
 */
public class UltraConcreteBuilder implements UltraBuilder {

    @Override
    public UltraBody buildBody() {
        return new UltraBody();
    }

    @Override
    public UltraWeapon buildWeapon() {
        return new UltraWeapon();
    }

    @Override
    public UltraCloak buildCloak() {
        return new UltraCloak();
    }
}
