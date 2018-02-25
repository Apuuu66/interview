package sword2offer;

/**
 * @author matolr.
 * @date 2018/2/25.
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法
 */
public class Code_9 {
	public int JumpFloorII(int target) {
		int[] fns = new int[target + 1];
		fns[1] = 1;
		for (int i = 2; i < fns.length; i++) {
			for (int j = 1; j < i; j++) {
				fns[i] += fns[j];
			}
			fns[i] += 1;
		}
		return fns[target];
	}

}
