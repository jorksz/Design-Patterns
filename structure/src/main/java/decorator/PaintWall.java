package decorator;

/**
 * 粉刷墙
 * @author lijt
 */
public class PaintWall implements BasicDecoration {

    @Override
    public void base() {
        System.out.println("粉刷墙");
    }
}
