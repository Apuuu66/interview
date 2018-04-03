package leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/3
 * 209. 大于给定和最短子数组
 * 题目描述：
 * 给定一个含有 n 个正整数的数组和一个正整数 s ,
 * 找到一个最小的连续子数组的长度，使得这个子数组的数字和 ≥  s 。
 * 如果不存在符合条件的子数组，返回 0。
 * 举个例子，给定数组 [2,3,1,2,4,3] 和 s = 7,
 * 子数组 [4,3]为符合问题要求的最小长度。
 */
public class Minimum_Size_Subarray_Sum_209 {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, right = -1;//nums[1...r]为我们的滑动窗口
        int sum = 0;
        int n = nums.length;
        int res = n + 1;
        while (left < n) {
            if (right + 1 < n && sum < s) {
                sum += nums[++right];
            } else {
                sum -= nums[left++];
            }
            if (sum >= s) {
                res = Math.min(res, right - left + 1);
            }
        }
        if (res == n + 1) {
            return 0;
        }
        return res;
    }
}
