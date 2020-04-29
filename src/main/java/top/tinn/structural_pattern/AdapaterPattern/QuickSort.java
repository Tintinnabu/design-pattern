package top.tinn.structural_pattern.AdapaterPattern;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 21:22
 */
public class QuickSort {
    public int[] quickSort(int[] array){
        sort(array,0,array.length-1);
        return array;
    }

    private void sort(int[] array, int l,int r){
        int q=0;
        if (l<r){
            q=partition(array,l,r);
            sort(array,l,q-1);
            sort(array,q+1,r);
        }
    }

    private int partition(int[] array, int l, int r) {
        int x=array[r];
        int j=l-1;
        for (int i=l;i<r;i++){
            if (array[i]<=x){
                swap(array,++j,i);
            }
        }
        swap(array,++j,r);
        return j;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        System.out.println(Arrays.toString(sort.quickSort(new int[]{1,3,5,2,4,5,8,2})));
    }
}
