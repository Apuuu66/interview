package sword2offer;

/**
 * Created on 2018/2/19.
 * 题目描述
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class Code_1 {
	public static boolean Find(int target, int[][] array) {
		int len = array.length - 1;
		int i = 0;
		while ((len >= 0) && (i < array[0].length)) {
			if (array[len][i] > target) {
				len--;
			} else if (array[len][i] < target) {
				i++;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		Find(7, arr);
//        int i;
//        for (i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println("\n");
//        }
//        System.out.println(arr.length+" "+arr[i-1].length);
//    }

//    public static boolean Find(int target, int[][] array) {
//        if (array[0][0] > target)
//            return false;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] == target) {
//                    return true;
//                } else if (array[i][j] > target)
//                    break;
//                else if (array[i][j] == target)
//                    return true;
//            }
//        }
//        return false;
	}
}
