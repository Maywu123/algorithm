package huafenpianduan;

import java.util.*;

/*
*将字符串划分，每个字母最多出现在一个块中
 */
public class MeiTuan {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            List<Integer> res = new ArrayList<>();
            res = huafen(str);
            for (Integer temp : res)
                System.out.print(temp + " ");
            sc.close();
        }

        public static List<Integer> huafen(String str) {
            // TODO Auto-generated method stub
            int[] arr = new int[128];
            for (int i = 0; i < str.length(); i++)//找到字母在str中的最后一个位置，
                arr[str.charAt(i)] = i;
            List<Integer> list = new ArrayList<>();
            int low = 0, high = 0;
            for (int i = 0; i < str.length(); i++) {
                high = Math.max(high, arr[str.charAt(i)]);
                if (i == high) {//当前位置和最后一个位置重合时，划分
                    list.add(high - low + 1);
                    low = high + 1;//下一个开始的位置
                }
            }
            return list;
        }

}
