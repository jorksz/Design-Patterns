package decorator;

/**
 * 装饰类
 */
public abstract class Decorator implements BasicDecoration{

    protected final BasicDecoration basicDecoration;

    public Decorator(BasicDecoration basicDecoration) {
        this.basicDecoration = basicDecoration;
    }
}
