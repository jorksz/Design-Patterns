package prototype;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("******test case1********");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("haha");
        ArrayList<String> arrayList1 = (ArrayList<String>) arrayList.clone();
        System.out.println(arrayList);
        System.out.println(arrayList1);

        System.out.println("******test case2********");
        arrayList1.add("ff");
        System.out.println(arrayList);
        System.out.println(arrayList1);

        System.out.println("******test case3********");
        arrayList.remove("haha");
        System.out.println(arrayList);
        System.out.println(arrayList1);

        System.out.println("******** test case4******");
        ArrayList<ShallowCopy> cloneEntities = new ArrayList<>();
        ShallowCopy shallowCopy = new ShallowCopy("you");
        cloneEntities.add(shallowCopy);
        ArrayList<ShallowCopy> cloneEntities1 = (ArrayList<ShallowCopy>) cloneEntities.clone();
        cloneEntities1.get(0).setName("you again");
        System.out.println(cloneEntities.get(0).getName());
        System.out.println(cloneEntities1.get(0).getName());

        System.out.println("******** 深拷贝 ******");
        DeepCopy deepCopy = new DeepCopy("deep copy test");
        RewriteArrayList deepCopies = new RewriteArrayList(deepCopy);
        RewriteArrayList deepCopies1 = (RewriteArrayList) deepCopies.clone();
        System.out.println(deepCopies.getDeepCopy().getName());
        System.out.println(deepCopies1.getDeepCopy().getName());
        deepCopies.getDeepCopy().setName("aaa");
        System.out.println(deepCopies.getDeepCopy().getName());
        System.out.println(deepCopies1.getDeepCopy().getName());
    }
}
