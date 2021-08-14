package prototype;

import java.util.ArrayList;

public class RewriteArrayList extends ArrayList {

    public DeepCopy getDeepCopy() {
        return deepCopy;
    }

    public void setDeepCopy(DeepCopy deepCopy) {
        this.deepCopy = deepCopy;
    }

    private DeepCopy deepCopy;

    public RewriteArrayList(DeepCopy deepCopy) {
        this.deepCopy = deepCopy;
    }

    public Object clone() {
        RewriteArrayList rewriteArrayList = (RewriteArrayList) super.clone();
        try {
            rewriteArrayList.deepCopy = (DeepCopy) deepCopy.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return rewriteArrayList;
    }
}
