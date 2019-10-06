package testvisitor1;

/**
 *封装某些作用于数据结构中各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作
 */
class A {

    public void method1(){
        System.out.println("我是A");
    }

    public void method2(B b){
        b.showA(this);
    }

}

class B {

    public void showA(A a){
        a.method1();
    }
}


public class TestVisitor1 {
    public static void main(String[] args){
        A a = new A();
        a.method1();
        a.method2(new B());
    }
}
