package shunxu;

public class Parent {

    public static int A = 1;//先初始化

    static {
        A = 2;//2
    }
}

    class Sub extends Parent {
        public static int B = A;//3

        public static void main(String[] args) {//4
            System.out.println(B);
        }
    }