package plus;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 不用加法符号实现a+b
 * a^b; 得到不含进位之和
 * (a & b)<<1; 进位
 * 只要进位不为零，则迭代；否则返回
 */
public class PlusTest {

    public int add(int a, int b) {

        int c = a & b;
        int r = a ^ b;

        if(c == 0){
            return r;
        }else{
            return add(r, c << 1);
        }

    }

    @Test
    public void testPlus(){
        int res = add(8,10);
        assertEquals(18,res);
    }
}
