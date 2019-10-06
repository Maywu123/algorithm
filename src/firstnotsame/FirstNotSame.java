package firstnotsame;

import java.util.Arrays;

/**
 * 求一个数组中第一个不重复的数字下标（首先得是不重复的集合里面的，并且是第一个）
 * @author cbw
 *
 */

public class FirstNotSame {

            public static int test(int[] numbers) {
            int length = numbers.length;
            int[] chong ;
            chong = new int[length];
            int count = 0;
            //找出重复元素放到chong数组里
            for(int i=0;i<length;i++) {
                for(int j=0;j<length && j!=i;j++) {
                    if(numbers[i] == numbers[j]) {
                        chong[count] = numbers[i];
                        count++;
                        break;
                    }
                }
            }
            //System.out.println(Arrays.toString(chong));

            for(int i=0;i<length;i++) {
                for(int j=0;j<count;j++) {
                    if(j == count-1) {
                        if(numbers[i]!=chong[j]) {
                            return i;
                        }
                    }else {
                        if(numbers[i] != chong[j]) {
                            continue;
                        }else {
                            break;
                        }
                    }
                }
            }


            return -1;
        }

        public static void main(String[] args) {
            int[] a = {1,4,2,3,2};
            int result = test(a);
            System.out.println(result);
        }
}
