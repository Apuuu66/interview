package sword2offer;

/**
 * Created by matolr on 2018/2/25.
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项。n<=39
 */
public class Code_7 {
	public int Fibonacci(int n) {
		if (n > 39 || n < 1) {
			return 0;
		}
		if (n <= 2) {
			return 1;
		}
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}
