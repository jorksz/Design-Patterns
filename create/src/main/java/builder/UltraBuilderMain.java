package builder;

/**
 * @author lijt
 */
public class UltraBuilderMain {

    public static void main(String[] args) {
        UltraBuilder ultraBuilder = new UltraConcreteBuilder();
        System.out.println("##################基础奥特曼");
        UltraDirectorSingleton.getInstance().ConstructBody(ultraBuilder);
        System.out.println("##################迪迦");
        UltraDirectorSingleton.getInstance().ConstructBodyAndWeapon(ultraBuilder);
        System.out.println("##################盖亚");
        UltraDirectorSingleton.getInstance().ConstructBodyAndWeaponAndCloak(ultraBuilder);
    }
}
