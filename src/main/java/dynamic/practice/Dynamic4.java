package dynamic.practice;

/**
 * Created by tsuki on 2017/9/8.
 */

import java.util.Scanner;

/**
 * 在上面的数字三角形中寻找一条从顶部到底边的路径，
 * 使得路径上所经过的数字之和最大。
 * 路径上的每一步都只能往左下或 右下走。
 * 只需要求出这个最大和即可，不必给出具体路径。
 * 三角形的行数大于1小于等于100，数字为 0 - 99
 *   输入格式：
 *   5      //表示三角形的行数    接下来输入三角形
 *   7
 *   3   8
 *   8   1   0
 *   2   7   4   4
 *   4   5   2   6   5
 *   要求输出最大和
 */
public class Dynamic4 {

    public static void main(String[] args) {
        int[][] a = new int[5][5];
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                a[i][j] = in.nextInt();
//            }
//        }
        a[0][0] = 7;
        a[1][0] = 3;
        a[1][1] = 8;
        a[2][0] = 8;
        a[2][1] = 1;
        a[2][2] = 0;
        a[3][0] = 2;
        a[3][1] = 7;
        a[3][2] = 4;
        a[3][3] = 4;
        a[4][0] = 4;
        a[4][1] = 5;
        a[4][2] = 2;
        a[4][3] = 6;
        a[4][4] = 5;
        int max = 0;
        int[][] sum = new int[15][15];// (n+1)*n/2
        sum[0][0] = a[0][0];
        for (int i = 1; i < 5; i++) {
            sum[i][0] = sum[i - 1][0] + a[i][0];
            sum[i][i] = sum[i - 1][i - 1] + a[i][i];
            for (int j = 1; j < i; j++) {
                if (sum[i - 1][j - 1] > sum[i - 1][j]) {
                    sum[i][j] = a[i][j] + sum[i - 1][j - 1];
                } else {
                    sum[i][j] = a[i][j] + sum[i - 1][j];
                }
                if (sum[i][j] > max) {
                    max = sum[i][j];
                }
            }
        }
        System.out.println(max);
    }

}
