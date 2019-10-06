package outer;

public class OuterClass {
    private String str;

    public void outerDisplay(){
        System.out.println("outerClass...");
    }

    public class InnerClass{
        public void innerDisplay(){
            str = "chenssy..."; //使用外围内的属性
            System.out.println(str);
            outerDisplay();  //使用外围内的方法
        }
    }

    // 推荐使用getxxx()来获取成员内部类，尤其是该内部类的构造函数无参数时
    public InnerClass getInnerClass(){
        return new InnerClass();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.getInnerClass();
        inner.innerDisplay();
    }
}