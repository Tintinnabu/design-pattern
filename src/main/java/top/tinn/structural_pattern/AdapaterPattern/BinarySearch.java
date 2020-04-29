package top.tinn.structural_pattern.AdapaterPattern;

/**
 * @ClassName BinarySearch
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 21:31
 */
public class BinarySearch {
    public int binarySearch(int[] array, int key){
        int l=0,r=array.length-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            int midVal = array[mid];
            if (midVal<key) l = mid + 1;
            else if (midVal> key) r = mid - 1;
            else return 1;
        }
        return -1;
    }
}
