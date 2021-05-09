package com.mode.creational.prototype;

public class DeepCopy implements Cloneable{
    private String name;

    public DeepCopy() {
        // nothing to do
    }

    public DeepCopy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return clone;
    }
}
