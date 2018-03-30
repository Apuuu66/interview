package sort;

import org.junit.Test;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/3/29
 */
public class BinarySearch {
    public static int BinarySearch(int arr[], int n, int target) {
//        在[1...r]的范围里寻找target
        int l = 0, r = n - 1;
//        当 l==r时，区间[l...r]依然是有效的
        while (l <= r) {
//            int mid = (l + r) / 2;
//            避免整形溢出
            int mid = r + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    @Test
    public void testBinarySearch() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
        int i = BinarySearch(arr, arr.length, 6);
        System.out.println(i);

    }
}
