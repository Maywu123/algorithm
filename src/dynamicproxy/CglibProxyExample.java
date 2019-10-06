package dynamicproxy;
//
//import java.lang.reflect.Method;
//
//public class CglibProxyExample implements MethodInterceptor{
//
//    //生成CGLIB代理对象
//    public Object getProxy(Class class){
//        //增强类
//        Enhancer enhancer=new Enhancer();
//        //设置增强类型
//        enhancer.setSuperClass(class);
//        //代理逻辑对象为当前对象
//        enhancer.setCallback(this);
//        //生成并返回代理对象
//        return enhancer.create();
//    }
//
//    public Object intercept(Object proxy,Method method,Object[] args,MethodProxy methodProxy) throws Throwable{
//        System.err.println("调用真实对象之前");
//        //反射调用真实对象
//        Object result=methodProxy.invokeSuper(proxy,args);
//        System.err.println("调用真实对象之后");
//        return result;
//    }
//
//    public static void main(String[] args){
//        CglibProxyExample cpe=new CglibProxyExample();
//        ReflectServiceImpl obj=(ReflectServiceImpl)cpe.getProxy(ReflectServiceImpl.class);
//        obj.sayHello("张三");
//    }
//}//
