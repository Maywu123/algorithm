package tenToeightString;

import java.util.Scanner;

public class TenToEightString {

    public static String str2HexStr(String str) {
            char[] chars = "0123456789ABCDEF".toCharArray();
            StringBuilder sb = new StringBuilder("");
            byte[] bs = str.getBytes();
            int bit;
            for (int i = 0; i < bs.length; i++) {
                bit = (bs[i] & 0x0f0) >> 4;
                sb.append(chars[bit]);
                bit = bs[i] & 0x0f; //位于运算
                sb.append(chars[bit]); //进行字符串的拼接
            }
            return sb.toString();
        }

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String t = str2HexStr(str);
            System.out.println(t.toString());
        }
}
