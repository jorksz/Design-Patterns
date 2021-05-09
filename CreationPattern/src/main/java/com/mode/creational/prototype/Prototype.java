package com.mode.creational.prototype;

public class Prototype implements Cloneable {


    public Prototype clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}
