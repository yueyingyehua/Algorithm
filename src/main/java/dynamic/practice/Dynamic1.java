package dynamic.practice;

/**
 * Created by tsuki on 2017/9/7.
 */

import java.util.Scanner;

/**
 * 有面值为1元，3元，5元的硬币若干，如何用最少的硬币凑够11元
 *   分析：用d(i)=j表示凑够i元最少需要j个硬币
 *      d(0) = 0
 *      d(1) = 1
 *      d(2) = d(2-1) + d(1) = d(1) + 1 = 2
 *      d(3) = {
 *             d(3-1) + d(1) = d(2) + 1 = 3
 *             d(3) = d(3-3) + 1 (用一个3元硬币)
 *      }
 *      d(3) = min{d(3-1) + 1, d(3-3) + 1}
 *      d(i) = min{d(i-Vj) + 1}  i-Vj >= 0, Vj表示第j个硬币的面值
 *
 */

public class Dynamic1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] min = new int[n + 1];
        //初始化
        //由于都可以用1组成所以都先初始化为i
        for (int i = 1; i <= n; i++) {
            min[i] = i;
        }
        int[] V = new int[3];
        V[0] = 1;
        V[1] = 3;
        V[2] = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 2; j++) {
                if (V[j] <= i && min[i - V[j]] + 1 < min[i]) {
                    min[i] = min[i - V[j]] + 1;
                }
            }
            System.out.println(min[i]);
        }

    }
}
