package top.tinn.structural_pattern.AdapaterPattern;

/**
 * @ClassName OperationAdapter
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 21:34
 */
public class OperationAdapter implements ScoreOperation {
    private BinarySearch binarySearch;
    private QuickSort quickSort;
    public OperationAdapter() {
        quickSort = new QuickSort();
        binarySearch = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        quickSort.quickSort(array);
        return binarySearch.binarySearch(array,key);
    }

    public static void main(String[] args) {
        OperationAdapter operationAdapter = new OperationAdapter();
        int[] array = {3,5,1,8};
        System.out.println(operationAdapter.search(array,1));
        System.out.println(operationAdapter.search(array,2));
    }
}
