package com.mode.structural.adapter.object_adapter;

/**
 * 对象适配器，已经存在的方法
 * @author lijt
 */
public class ObjectAdaptee {


    /**
     * 被适配的接口
     */
    void specificRequest() {
        System.out.println("ObjectSpecificRequest");
    }
}
