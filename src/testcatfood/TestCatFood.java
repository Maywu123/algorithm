package testcatfood;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 小招喵喜欢吃喵粮。这里有 N 堆喵粮，第 i 堆中有 p[i] 粒喵粮。喵主人离开了，将在 H 小时后回来。
 *
 * 小招喵可以决定她吃喵粮的速度 K （单位：粒/小时）。每个小时，她将会选择一堆喵粮，从中吃掉 K 粒。如果这堆喵粮少于 K 粒，
 * 她将吃掉这堆的所有喵粮，然后这一小时内不会再吃更多的喵粮。
 *
 * 小招喵喜欢慢慢吃，但仍然想在喵主人回来前吃掉所有的喵粮。
 *
 * 返回她可以在 H 小时内吃掉所有喵粮的最小速度 K（K 为整数）。
 */
public class TestCatFood {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);

            String[] str = sc.nextLine().split(" ");
            int n = str.length, h = sc.nextInt();

            int[] nums = new int[n];
            int total = 0;

            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(str[i]);
                total += nums[i];
            }

            int k  = total / h;//总的猫粮总量除以时间，至少每小时吃的猫粮数量
            while (costTime(nums, k) > h) {
                k++;
            }

            System.out.println(k);
        }

        private static int costTime(int[] nums, int k) {
            int total_h = 0;//吃完猫粮花费的时间
            for (int i = 0; i < nums.length; i++) {
                total_h += nums[i] % k == 0 ? nums[i] / k : nums[i] / k + 1 ;
            }
            return total_h;
        }
}
