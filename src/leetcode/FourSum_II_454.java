package leetcode;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/4/6
 */
public class FourSum_II_454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum = A[i] + B[j];
                if (map.containsKey(sum)) {
                    map.compute(sum, (K, V) -> ++V);
                } else {
                    map.put(sum, 1);
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = 0 - C[i] - D[j];
                if (map.containsKey(sum)) {
                    res += map.get(sum);
                }
            }
        }
        return res;
    }
}
