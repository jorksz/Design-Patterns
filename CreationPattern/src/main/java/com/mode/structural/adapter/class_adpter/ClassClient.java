package com.mode.structural.adapter.class_adpter;

/**
 * @author lijt
 */
public class ClassClient {

    public static void main(String[] args) {
        ClassTarget classTarget = new ClassAdapter();
        classTarget.request();
    }
}
