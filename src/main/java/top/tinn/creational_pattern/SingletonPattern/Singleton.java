package top.tinn.creational_pattern.SingletonPattern;

/**
 * @ClassName Singleton
 * @Description Initialization Demand Holder (IoDH)
 * 我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为
 * 一种最好的Java语言单例模式实现方式
 * @Author Tinn
 * @Date 2020/4/12 15:23
 */
public class Singleton {
    private Singleton(){}

    private static class HolderClass{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        Singleton s1,s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
