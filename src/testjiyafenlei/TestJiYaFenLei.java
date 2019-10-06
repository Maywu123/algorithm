package testjiyafenlei;


/**招商银行
 * 农场有n只鸡鸭排为一个队伍，鸡用“C”表示，鸭用“D”表示。当鸡鸭挨着时会产生矛盾。需要对所排的队伍进行调整，使鸡鸭各在一边。
 * 每次调整只能让相邻的鸡和鸭交换位置，现在需要尽快完成队伍调整，
 * 你需要计算出最少需要调整多少次可以让上述情况最少。
 * 例如：CCDCC->CCCDC->CCCCD这样就能使之前的两处鸡鸭相邻变为一处鸡鸭相邻，需要调整队形两次
 */

import java.io.IOException;
import java.util.Scanner;

public class TestJiYaFenLei {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        //分别统计C在前面和D在前面的移动次数
        int retC = 0, retD = 0, count_C = 0, count_D = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'C') {
                retC += i - count_C;
                count_C++;//记录出现前面出现多少个 'C',从第i个位置把C移动到底count_c个位置需要移动 i - count_c次
            } else {
                retD += i - count_D;
                count_D++;//记录出现前面出现多少个 'D'
            }
        }
        System.out.println(Math.min(retC,retD));
    }
}