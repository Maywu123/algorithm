package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    //JDK动态代理
    interface IHello{
        void sayHello();
    }

    static class Hello implements IHello{
        public void sayHello(){
            System.out.println("hello world");
        }
    }

    static class DynamicProxy implements InvocationHandler{
        Object originalObj;

        //1.代理对象和真实对象建立代理关系
        Object bind(Object originalObj){
            this.originalObj=originalObj;
            return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(),originalObj.getClass().getInterfaces(),this);
        }

        //2.代理方法逻辑
        public Object invoke(Object proxy, Method method,Object[] args) throws Throwable{
            System.out.println("welcome");
            return method.invoke(originalObj,args);//调度真实对象之前，先sayHello,
        }
    }

    public static void main(String[] args){
        IHello hello=(IHello) new DynamicProxy().bind(new Hello());
        hello.sayHello();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
    }
}
