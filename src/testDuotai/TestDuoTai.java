package testDuotai;

public class TestDuoTai {

    public static void main(String[] args) {
        A isA = new A();
        isA.Out();//输出A

        A isB = new B();
        isB.Out();//输出B
        isB.sop();//输出的是A hhh,因为子类没有重写，所以指向的是父类的该方法

        A isC = new C();
        isC.Out();//输出C
    }

}

class A{
    public void Out()
    {
        System.out.println("This is A");
    }

    public void sop(){
        System.out.println("A hhh");
    }
}

class B extends A{
    public void Out()
    {
        System.out.println("This is B");
    }
}

class C extends A{
    public void Out()
    {
        System.out.println("This is C");
    }
}