package decorator;

/**
 * 窗帘装饰
 */
public class Curtain extends Decorator {

    public Curtain(BasicDecoration basicDecoration) {
        super(basicDecoration);
    }

    @Override
    public void base() {
        basicDecoration.base();
        System.out.println("窗帘装饰");
    }
}
