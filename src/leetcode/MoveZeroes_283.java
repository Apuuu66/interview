package leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/3/30
 * 283. 移动零
 * 题目描述：
 * 给定一个数组 nums, 编写一个函数将所有 0 移动到它的末尾，同时保持非零元素的相对顺序。
 * 例如， 定义 nums = [0, 1, 0, 3, 12]，调用函数之后， nums 应为 [1, 3, 12, 0, 0]。
 * 注意事项:
 * 必须在原数组上操作，不要为一个新数组分配额外空间。
 * 尽量减少操作总数。
 */
public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
//       nums中，[0...k)的元素均为非零元素
        int k = 0;
        //遍历到第i个元素后，保证[0...i]中所有非零元素都按照顺序排列在[0...k)中
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i == k) {
                    k++;
                } else {
                    nums[i] = nums[i] ^ nums[k];
                    nums[k] = nums[i] ^ nums[k];
                    nums[i] = nums[i] ^ nums[k];
                    k++;
                }
            }
        }

    }

}
