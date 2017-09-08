package dynamic.practice;

/**
 * Created by tsuki on 2017/9/8.
 */

import java.util.Scanner;

/**
 * 一个序列有N个数： A[1], A[2],……,A[N], 求出最长非降子序列的长度（即最长增长子序列 LIS）
 *  例：5,3,4,8,6,7
 *  d(1) = 1 (序列：5)
 *  d(2) = 1 (序列：3， 3的前面没哟比3小的）
 *  d(3) = 2 (序列：3,4； 4前面有个比它小的3， 所以d(3) = d(2) + 1)
 *  d(4) = 3 (序列：3,4,8； 8前面比它小的有3个数， 所以d(4) = max{d(1), d(2), d(3)} + 1 = 3)
 *
 *  d(i) = max{1, d(j) + 1}, j<i, A[j] <= A[i]
 */

public class Dynamic2 {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);

        int[] A = {5, 3, 4, 8, 6, 7};
        int len = 1;
        int n = A.length;
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[j] <= A[i] && d[j] + 1 > d[i]) {
                    d[i] = d[j] + 1;
                }
            }
            System.out.println(d[i]);
        }
    }
}
