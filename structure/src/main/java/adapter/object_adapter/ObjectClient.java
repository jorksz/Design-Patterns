package adapter.object_adapter;

/**
 * @author lijt
 */
public class ObjectClient {

    public static void main(String[] args) {
        ObjectTarget objectTarget = new ObjectAdapter(new ObjectAdaptee());
        objectTarget.request();
    }
}
