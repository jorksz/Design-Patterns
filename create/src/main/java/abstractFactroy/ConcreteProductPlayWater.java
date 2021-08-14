package abstractFactroy;

/**
 * @author lijt
 */
public class ConcreteProductPlayWater extends AbstractProductPlay {
    @Override
    public void play() {
        System.out.println("我正在玩水");
    }
}
