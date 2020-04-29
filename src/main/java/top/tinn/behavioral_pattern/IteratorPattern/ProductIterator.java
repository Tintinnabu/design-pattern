package top.tinn.behavioral_pattern.IteratorPattern;

import java.util.List;

/**
 * @ClassName ConcreteIterator
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:38
 */
public class ProductIterator implements AbstractIterator {
    private ProductList productList;
    private List products;
    private int cursor1;
    private int cursor2;

    public ProductIterator(ProductList productList) {
        this.productList = productList;
        this.products = productList.objectList;
        cursor1 = 0;
        cursor2 = products.size() - 1;
    }

    @Override
    public void next() {
        if (cursor1 < products.size())
            cursor1++;
    }

    @Override
    public boolean isLast() {
        return cursor1 == products.size();
    }

    @Override
    public void previous() {
        if (cursor2 > -1)
            cursor2--;
    }

    @Override
    public boolean isFirst() {
        return cursor2 == -1;
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
