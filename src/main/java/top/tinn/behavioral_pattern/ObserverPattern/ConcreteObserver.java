package top.tinn.behavioral_pattern.ObserverPattern;

/**
 * @ClassName ConcreteObserver
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 16:26
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("响应");
    }
}
