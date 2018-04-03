package leetcode;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/3
 * 75. 分类颜色
 * 题目描述:
 * 给定一个包含红色、白色和蓝色，且含有 n 个元素的数组，对它们进行排序，
 * 使得相同颜色的元素相邻，颜色顺序为红色、白色、蓝色。
 * 此题中，我们使用整数 0, 1 和 2 分别表示红色，白色和蓝色。
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 */
public class Sort_Colors_75 {
    public void sortColors(int[] nums) {
        //采用三路快排中的一次partition，将数组分割成三部分
        //[0...l]存放0，[r...n-1]存放2，中间部分是0。
        int l = -1, r = nums.length;
        int i = 0;
        while (i < r) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                l++;
                swap(nums, i, l);
                i++;
            } else {
                assert (nums[i] == 2);
                r--;
                swap(nums, i, r);
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        if (i != j) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
    }

    @Test
    public void testSortColors_75() {
        int[] arr = {2};
        sortColors(arr);
        System.out.println(arr[0]);

    }
}
