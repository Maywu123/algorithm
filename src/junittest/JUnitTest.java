package junittest;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.Date;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JUnitTest {
    GotoWork gotoWork = new GotoWork();

    String[] skill = { "Java", "MySQL" };


    @BeforeClass
    public static void beforeClass(){
        System.out.println("-------------------beforeClass");

    }

    //在当前测试类结束时运行。
    @AfterClass
    public static void afterClass(){
        System.out.println("-------------------afterClass");

    }



    //每个测试方法运行之前运行
    @Before
    public void before(){
        System.out.println("=====before");

    }

    //每个测试方法运行之后运行
    @After
    public void after(){
        System.out.println("=====after");

    }

    @Test
    public void testPrepareSkills() {
        System.out.println("Inside testPrepareSkills()");
        assertArrayEquals(skill, gotoWork.prepareSkills());

    }

    String[] skill2 = { "Java", "MySQL", "JSP", "JUnit" };

    @Test
    public void testAddSkills() {

        System.out.println("Inside testAddPencils()");
        assertArrayEquals(skill2, gotoWork.addSkills());

    }

    @Test
    public void myFirstTest() {
        assertEquals(2+1, 4);
    }


    @Test
    public void testAdd() {
        GotoWork work = new GotoWork();
        int result = work.add(2,2);
        assertEquals(result, 4);

    }

    //验证超时
    @Test(timeout=100)
    public void testAdd2() throws InterruptedException {
        Thread.sleep(101);
        new GotoWork().add(1, 1);

    }

    //验证抛出异常,确实抛出异常，符合预期
    @Test(expected=ArithmeticException.class)
    public void testDivision() {
        new GotoWork().division(8, 0);
    }

    // 跳过该条用例

    @Ignore
    @Test
    public void testAdd3() {
        GotoWork count = new GotoWork();
        int result = count.add(2,2);
        assertEquals(result, 5);
    }

    @Test
    public void testPrime(){
        int n = 8;
        assertTrue(new GotoWork().Prime(n));

    }

    //添加一个关闭钩子，添加成功
    @Test
    public void addShutdownHook(){
        Runtime.getRuntime().addShutdownHook(new Thread(){
            public void run(){
                System.out.println("Shutting down JVM at time: " + new Date());
            }
        });
    }


}
