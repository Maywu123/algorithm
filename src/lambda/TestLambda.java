package lambda;

import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestLambda {

    List<Integer> lists = Arrays.asList(1,2,3,4,5);

    @Test
    public void testYeepay(){
        System.out.println("用@Test标示测试方法！");
        System.out.println("hh");
    }

    @AfterClass
    public static void paylus(){
        System.out.println("用@AfterClass标示的方法在测试用例类执行完之后！");
    }

}
