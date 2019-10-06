package fanxinglei;

public class BoxTest {
    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("hhhhh"));

        System.out.println("整型值为 : " + integerBox.get());
        System.out.println("字符串为 :" + stringBox.get());
    }
}
