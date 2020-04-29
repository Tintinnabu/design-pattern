package top.tinn.behavioral_pattern.ObserverPattern;

/**
 * @ClassName ConcreteSubject
 * @Description  * @Description used in Publish/Subscribe,
 *  *              Model/View, Dependents and Source/Listener
 * @Author Tinn
 * @Date 2020/4/13 16:25
 */
public class ConcreteSubject extends Subject {
    @Override
    public void not1fy() {
        for (Observer obj : observers){
            obj.update();
        }
    }
}
