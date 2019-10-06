package testreflect;
import java.lang.Exception;

public class TestReflect {

    //一个对象获得完整的包名和类名
//    public static void main(String[] args) {
//        TestReflect testReflect = new TestReflect();
//        System.out.println(testReflect.getClass().getName());
//    }

    //实例化Class类对象
    public static void main(String[] args) throws Exception {
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // 一般采用这种形式
        class1 = Class.forName("testreflect.TestReflect");
        class2 = new TestReflect().getClass();
        class3 = TestReflect.class;
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());
    }


}
