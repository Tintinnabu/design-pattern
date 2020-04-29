package top.tinn.behavioral_pattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subject
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 16:23
 */
abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public abstract void not1fy();
}
