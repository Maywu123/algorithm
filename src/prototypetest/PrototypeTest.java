package prototypetest;

/**
 * 原型模式，实现拷贝对象，用于对象的复制，实现clonable接口，重写Object的clone()
 */
class Prototype implements Cloneable{

    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }

}

class ConcretePrototype extends Prototype{
    public void show(){
        System.out.println("原型模式实现类！");
    }
}

public class PrototypeTest {
    public static void main(String[] args){
        ConcretePrototype cp = new ConcretePrototype();
        for(int i = 0; i < 10; i++){
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            clonecp.show();
        }
    }
}

/**
 * 除了8中基本类型和他们的封装类型和String外，数组，list等都是浅拷贝，那就需要另外拷贝。如下：
 */

//class Prototype implements Cloneable{
//    private ArrayList list = new ArrayList();
//    public Prototype clone(){
//        Prototype prototype = null;
//        try{
//            prototype = (Prototype)super.clone();
//            prototype.list = (ArrayList)this.list.clone();
//        }catch(CloneNotSupportedException e){
//            e.printStackTrace();
//        }
//        return prototype;
//    }
//}

