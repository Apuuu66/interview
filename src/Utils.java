/**
 * Created by IntelliJ IDEA.
 * User: porker
 * Date: 2018/3/30
 */
public class Utils {
    public static void swap(int[] arr, int i, int j) {
        if (i != j) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
    }
}
