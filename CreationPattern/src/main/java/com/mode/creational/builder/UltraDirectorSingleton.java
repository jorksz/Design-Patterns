package com.mode.creational.builder;


import java.util.ArrayList;
import java.util.List;

/**
 * @author lijt
 */
public class UltraDirectorSingleton {

    private static volatile UltraDirectorSingleton singleton;

    private UltraDirectorSingleton() {
        // 不提供构造方法
    }

    public List<Object> ConstructBody(UltraBuilder builder) {
        List<Object> builders = new ArrayList<>();
        builders.add(builder.buildBody());
        return builders;
    }


    public List<Object> ConstructBodyAndWeapon(UltraBuilder builder) {
        List<Object> builders = new ArrayList<>();
        builders.add(builder.buildBody());
        builders.add(builder.buildWeapon());
        return builders;
    }

    public List<Object> ConstructBodyAndWeaponAndCloak(UltraBuilder builder) {
        List<Object> builders = new ArrayList<>();
        builders.add(builder.buildBody());
        builders.add(builder.buildWeapon());
        builders.add(builder.buildCloak());
        return builders;
    }

    public static UltraDirectorSingleton getInstance() {
        if (singleton == null) {
            synchronized (UltraDirectorSingleton.class) {
                if (singleton == null) {
                    singleton = new UltraDirectorSingleton();
                }
            }
        }
        return singleton;
    }
}
