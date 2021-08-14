package adapter.object_adapter;

/**
 * @author lijt
 */
public class ObjectAdapter implements ObjectTarget {

    private ObjectAdaptee objectAdaptee;

    public ObjectAdapter(ObjectAdaptee adaptee) {
        this.objectAdaptee = adaptee;
    }

    @Override
    public void request() {
        this.objectAdaptee.specificRequest();
    }
}
