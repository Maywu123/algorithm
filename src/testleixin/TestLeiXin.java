package testleixin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 最长回文字符串
 * 输入一个字符串，请找出该字符串的包含的最长回文子字符串
 * 比如，输入babcd，输出baba
 * 输入abbc，输出bb
 */

public class TestLeiXin {
        private static String res = "";

//        public static void main(String[] args) {
//
//            Scanner sc = new Scanner(System.in);
//            String str = sc.nextLine();
//            String tmp = "";
//            for (int i = 0; i < str.length(); i++) {
//                for (int j = i + 1; j <= str.length();j++)
//                    tmp = str.substring(i, j);
//                if (isDuichen(tmp)) {
//                    if (res.length() < tmp.length()) {
//                        res = tmp;
//                    }
//                }
//            }
//        System.out.println(res);
//    }

//    private static boolean isDuichen(String str) {
//        String rev = new StringBuffer(str).reverse().toString();
//        return rev.equals(str);
//    }
}

/**
 *现有字符串char[] text，实现函数char[] drawChar(char[] text)，
 找出text中重复出现最多的字符，然后将该字符移到text的最前端，生成一个新的字符串。
 假设重复出现最多的字符只有一个。请充分考虑内存和性能效率。 举例： “abcaba”，转换后成为“aaabcb”。
 */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char ch[] = sc.nextLine().toCharArray();
//        System.out.println(drawChar(ch));
//    }
//
//    public static char[] drawChar(char[] text) {
//        Map<Character, Integer> map = new HashMap();
//        for (int i = 0; i < text.length; i++) {
//            if (!map.containsKey(text[i])) {
//                map.put(text[i], 1);
//            } else {
//                int val = map.get(text[i]);
//                map.put(text[i], ++val);
//            }
//        }
//        int max = 0;
//        char ch = '0';
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > max) {
//                max = entry.getValue();
//                ch = entry.getKey();
//            }
//        }
//        StringBuffer sb_head = new StringBuffer(), sb_foot = new StringBuffer();
//        for (int i = 0; i < text.length; i++) {
//            if (text[i] == ch) {
//                sb_head.append(text[i]);
//            } else {
//                sb_foot.append(text[i]);
//            }
//        }
//        sb_head.append(sb_foot);
//        return sb_head.toString().toCharArray();
//    }
//}
