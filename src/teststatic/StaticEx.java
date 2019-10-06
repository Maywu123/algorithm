package teststatic;

import org.junit.Test;

import java.awt.*;

public class StaticEx {
    public static int EXAMPLE_VALUE=90;


    @Test
    public void testSatc() {

        System.out.println(StaticEx.EXAMPLE_VALUE);//推荐

        StaticEx s=new StaticEx();
        System.out.println(s.EXAMPLE_VALUE);//可以访问到值，但是不推荐
    }
}
