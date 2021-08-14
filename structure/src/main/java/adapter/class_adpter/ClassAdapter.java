package adapter.class_adpter;

/**
 * @author lijt
 */
public class ClassAdapter extends ClassAdaptee implements ClassTarget {

    @Override
    public void request() {
        specificRequest();
    }
}
