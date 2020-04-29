package top.tinn.structural_pattern.FlyweightPattern;

/**
 * @ClassName IgoChessman
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 14:29
 */
abstract class IgoChessman {
    public abstract String getColor();
    public void display(){
        System.out.println(getColor());
    }
}
