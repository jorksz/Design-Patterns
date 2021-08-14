package template;

public class CheckMain {

    public static void main(String[] args) {
        AbstractCheck check = new ClothesChecked();
        check.sell();
        check = new FruitChecked();
        check.sell();
    }
}
