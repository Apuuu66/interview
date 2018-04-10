package leetcode;

import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/10
 * 220. 存在重复 III
 * 题目描述：
 * 给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，
 * 使 nums [i] 和 nums [j] 的绝对差值最大为 t，并且 i 和 j 之间的绝对差值最大为 ķ。
 */
public class Contains_Duplicate_III_220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k > 3000) {
            return false;
        }
        if (nums.length < 2 || k < 1) {
            return false;
        }
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i]))
//                return true;
            if (set.ceiling((long) nums[i] - (long) t) != null &&
                    set.ceiling((long) nums[i] - (long) t) <= (long) nums[i] + (long) t) {
                return true;
            }
            set.add((long) nums[i]);
            if (set.size() > k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }
}
