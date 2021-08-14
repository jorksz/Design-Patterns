package template;

/**
 * 衣服检查类
 * @author lijt
 */
public class ClothesChecked extends AbstractCheck {

    @Override
    public boolean check() {
        System.out.println("衣服有漏洞");
        return false;
    }
}
