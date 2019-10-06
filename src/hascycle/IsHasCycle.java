package hascycle;

import java.util.Scanner;


public class IsHasCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("Q");

        StringBuffer sb = new StringBuffer();
        int count = 1;
        for(int i = str.length; i >= 0; i--) {
            for(int j=0;j<str[i].length();j++) {
                if (str[i].charAt(j) >= 'a' || str[i].charAt(i) <= 'a') {
                    sb.append(i);
                }
            }
            System.out.println(str[i]);
        }
        System.out.println(sb.toString());
    }
}