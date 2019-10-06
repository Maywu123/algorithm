package isinterleave;

public class IsInterleave {

    public static void main(String[] args){
        String str1="aabcc";
        String str2="dbbca";
        String str3="aadbbcbcac";
        String str4="aadbbbaccc";

        String str5="abc";
        String str6="dgk";
        String str7="adbgkc";

        boolean flag=isInterleave(str1,str2,str3);
        System.out.println(flag);

        boolean flag1=isInterleave(str1,str2,str4);
        System.out.println(flag1);

        boolean flag2=isInterleave(str5,str6,str7);
        System.out.println(flag2);

    }

    //判断str3是否由1和2交叉组合组成
    public static boolean isInterleave(String s1, String s2, String s3){
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if((len1 + len2) != len3){ // 长度不一致，则显然不可能
            return false;
        }
        // dp[i][j]表示s3[1,len1+len2]是否由s1[1,len1]和s2[1,len2]交错组成
        boolean[][] dp = new boolean[len1+1][len2+1];
        dp[0][0] = true; // 空串与空串交错组成空串
        for(int i = 0; i < len1+1; i++){
            for(int j = 0; j < len2+1; j++){
                if((i-1) >= 0 && dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1+j)){
                    // dp[i-1][j]=true表示s3[1, i-1+j]由s1[1,i-1]和s2[1,j]交错组成,如果s1.charAt(i-1)与s3.charAt(i-1+j)相等，那么很显然dp[i][j]也为true
                    dp[i][j] = true;
                }
                if((j-1) >= 0 && dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)){
                    // dp[i][j-1]=true表示s3[1, i+j-1]由s1[1,i]和s2[1,j-1]交错组成,如果s2.charAt(j-1)与s3.charAt(i+j-1)相等，那么很显然dp[i][j]也为true
                    dp[i][j] = true;
                } // 除以上两种情况外，dp[i][j]为false
            }
        }
        return dp[len1][len2];
    }
}
