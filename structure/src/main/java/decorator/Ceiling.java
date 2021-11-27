package decorator;

/**
 * 天花板
 * @author lijt
 */
public class Ceiling implements BasicDecoration {

    @Override
    public void base() {
        System.out.println("天花板装饰");
    }
}
