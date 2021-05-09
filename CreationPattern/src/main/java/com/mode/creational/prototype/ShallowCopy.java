package com.mode.creational.prototype;

public class ShallowCopy {

    private String name;

    public ShallowCopy() {
        // nothing to do
    }

    public ShallowCopy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
