package maxlengthsubstring;

import java.util.HashSet;
import java.util.Set;
/*
滑动窗口思想：如果确定子串s[i,j]（假设表示字符串的第i个字符到第j-1个字符表示的子串），那么只需要比较s[j]是否与子串s[i,j]重复即可
若重复：记录此时滑动窗口大小，并与最大滑动窗口比较，赋值。然后滑动窗口大小重定义为1，头位置不变，并右移一个单位。
若不重复：滑动窗口头不变，结尾+1，整个窗口加大1个单位。继续比较下一个。
 */

public class LengthOfLongestSubstring {

    public static void main(String[] args){
        String str="adkadkgg";//adkg
        int res=lengthOfLongestSubstring(str);
        System.out.println(res);
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
