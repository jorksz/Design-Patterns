package adapter.class_adpter;

/**
 * 用户这边提供的接口
 * @author lijt
 */
public interface ClassTarget {

    /**
     * 用户这边希望调用这个接口就能实现 Adaptee {@link ClassAdaptee#specificRequest()} 方法
     */
    void request();
}
