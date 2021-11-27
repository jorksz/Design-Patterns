package decorator;

public class UserMain {
    public static void main(String[] args) {
        BasicDecoration basicDecoration = new Curtain(new PaintWall());
        basicDecoration.base();
    }
}
