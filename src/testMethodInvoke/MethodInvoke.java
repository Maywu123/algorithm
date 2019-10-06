package testMethodInvoke;

import java.lang.reflect.Method;

public class MethodInvoke {
    public static void main(String[] args) throws Exception{
        String str = "hello";
        Method m = str.getClass().getMethod("toUpperCase");
        System.out.println(m.invoke(str));
    }
}
