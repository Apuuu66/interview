package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/7
 * 219. 存在重复 II
 * 题目描述：
 * 给定一个整数数组和一个整数 k，
 * 判断数组中是否存在两个不同的索引 i 和 j，使 nums [i] = nums [j]，并且 i 和 j 的绝对差值最大为 k。
 */
public class Contains_Duplicate_II_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k > 3000) return false;
        if (nums.length < 2 || k < 1) {
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
            if (set.size() > k)
                set.remove(nums[i - k]);
        }
        return false;
    }
}
