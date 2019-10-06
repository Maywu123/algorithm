package testJumpFloor;

import java.util.Scanner;

public class TestJumpFloor {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(jumpFloor(sc.nextInt()));
    }

    public static int jumpFloor(int n){
        if(n <= 2)
            return n;

        int f = 1;
        int s = 2;

        for(int i = 3; i <= n; i++){
            int temp = f + s;
            f = s;
            s = temp;
        }

        return s;
    }
}
