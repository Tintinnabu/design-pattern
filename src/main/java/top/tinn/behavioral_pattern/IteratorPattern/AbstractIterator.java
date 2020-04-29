package top.tinn.behavioral_pattern.IteratorPattern;

/**
 * @ClassName AbstractIterator
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:37
 */
interface AbstractIterator {
    void next();
    boolean isLast();
    void previous();
    boolean isFirst();
    Object getNextItem();
    Object getPreviousItem();

}
