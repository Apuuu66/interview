package leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/3
 * 11. 盛最多水的容器
 * 题目描述：
 * 给定 n 个正整数 a1，a2，...，an，其中每个点的坐标用（i, ai）表示。
 * 画 n 条直线，使得线 i 的两个端点处于（i，ai）和（i，0）处。
 * 请找出其中的两条直线，使得他们与 X 轴形成的容器能够装最多的水。
 * 注意：你不能倾斜容器，n 至少是2。
 */
public class Container_With_Most_Water_11 {
    public int maxArea(int[] height) {
        int len = height.length, low = 0, high = len -1 ;
        int maxArea = 0;
        while (low < high) {
            maxArea = Math.max(maxArea, (high - low) * Math.min(height[low], height[high]));
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return maxArea;
    }
}
