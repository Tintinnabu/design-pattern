package top.tinn.behavioral_pattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Client
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:44
 */
public class Client {
    public static void main(String[] args) {
        List<Object> products = new ArrayList();
        products.add("1");
        products.add("2");
        products.add("3");
        AbstractObjectList list;
        AbstractIterator iterator;

        list = new ProductList(products);
        iterator = list.creatIterator();
        System.out.println(iterator.getClass().toString());
        while (!iterator.isLast()){
            System.out.print(iterator.getNextItem());
            iterator.next();
        }
        System.out.println();
        while (!iterator.isFirst()){
            System.out.print(iterator.getPreviousItem());
            iterator.previous();
        }
    }
}
