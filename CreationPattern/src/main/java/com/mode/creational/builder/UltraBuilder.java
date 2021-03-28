package com.mode.creational.builder;

/**
 * @author lijt
 */
public interface UltraBuilder {

    /**
     * 构造身体对象
     * @return
     */
    UltraBody buildBody();

    /**
     * 构建武器对象
     * @return
     */
    UltraWeapon buildWeapon();

    /**
     * 构建披风对象
     * @return
     */
    UltraCloak buildCloak();
}
