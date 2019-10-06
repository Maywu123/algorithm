package knapsack01;

/**
 * 01背包问题，在一定容量下，装下价值最大的物品。
 */
public class KanpSack01 {

    public static int knapSack(int[] w,int[] v,int c){

        int size = w.length;
        if(size == 0){
            return 0;
        }

        int[][] dp = new int[size][c+1];

        for(int i = 0; i <= c;i++){
            dp[0][i] = 0;
        }

        for(int j = 0; j < size; j++){
            dp[j][0] = 0;
        }

        for(int i = 1; i < size; i++){
            for(int j = 1; j <= c ; j++){
                if(j < w[i]){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
                }
            }
        }
        return dp[size-1][c];
    }

    public static void main(String[] args){
        int[] w = {2,4,6,9};
        int[] v = {4,3,7,5};
        int c = 10;
        System.out.println(knapSack(w,v,c));
    }

}
