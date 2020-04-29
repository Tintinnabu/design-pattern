package top.tinn.behavioral_pattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AbstractObjectList
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:35
 */
abstract class AbstractObjectList {
    protected List<Object> objectList = new ArrayList<>();

    public AbstractObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public void addObject(Object obj){
        objectList.add(obj);
    }

    public void removeObject(Object obj){
        objectList.remove(obj);
    }

    public List getObjects(){
        return objectList;
    }

    public abstract AbstractIterator creatIterator();
}
