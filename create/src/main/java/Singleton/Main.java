package Singleton;

public class Main {

    public static void main(String[] args) {
        EnumSingleton.SINGLETON.test();
        System.out.println(DoubleCheckSingleton.getInstance());
    }
}
