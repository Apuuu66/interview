package sword2offer;

/**
 * Created by matolr on 2018/2/25.
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Code_8 {
	public int JumpFloor(int target) {
		int a = 1, b = 2, c = 0;
		if (target < 0) {
			return 0;
		} else if (target == 1) {
			return 1;
		} else if (target == 2) {
			return 2;
		} else {
			for (int i = 3; i <= target; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			return c;
		}
	}
}
