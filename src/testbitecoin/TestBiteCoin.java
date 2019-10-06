package testbitecoin;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 给定一个正整数数组，它的第 i 个元素是比特币第 i 天的价格。
 *
 * 如果你最多只允许完成一笔交易（即买入和卖出一次），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意你不能在买入比特币前卖出。
 */

public class TestBiteCoin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
            if(sc.next() == "\0")
                break;
        }
        Integer[] coin = new Integer[list.size()];
        list.toArray(coin);
        int profit = 0;

        for(int i = coin.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                profit = Math.max((coin[i]-coin[j]),profit);
            }
        }
        System.out.println(profit);
    }
}
