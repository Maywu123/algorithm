package findtwo;

import java.util.Scanner;

public class FindTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= end; i++) {
            int temp = i;
            while (temp > 0) {
                int n = temp % 10;
                if (n == 2) {
                    count++;
                }
                temp /= 10;
            }
        }
        System.out.println(count);
    }
}
