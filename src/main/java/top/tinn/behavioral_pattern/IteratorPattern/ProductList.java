package top.tinn.behavioral_pattern.IteratorPattern;

import java.util.List;

/**
 * @ClassName ProductList
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:39
 */
public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> objectList) {
        super(objectList);
    }

    @Override
    public AbstractIterator creatIterator() {
        //return new ProductIterator(this);
        return new ProductIterator();
    }

    /**
     *  内部类实现
     */
    private class ProductIterator implements AbstractIterator{
        private int cursor1;
        private int cursor2;

        public ProductIterator() {
            this.cursor1 = 0;
            this.cursor2 = objectList.size()-1;
        }

        @Override
        public void next() {
            if (cursor1<objectList.size())
                cursor1++;
        }

        @Override
        public boolean isLast() {
            return cursor1 == objectList.size();
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
            return objectList.get(cursor1);
        }

        @Override
        public Object getPreviousItem() {
            return objectList.get(cursor2);
        }
    }
}
