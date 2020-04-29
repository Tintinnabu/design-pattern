package top.tinn.structural_pattern.FlyweightPattern;

/**
 * @ClassName Client
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 14:33
 */
public class Client {
    public static void main(String[] args) {
        IgoChessman b1,b2,w1,w2;
        IgoChessmanFactory factory;
        factory = IgoChessmanFactory.getInstance();
        b1 = factory.getIgoChessman("b");
        b2 = factory.getIgoChessman("b");
        System.out.println(b1 == b2);
        System.out.println(b1.getColor());
    }
}
