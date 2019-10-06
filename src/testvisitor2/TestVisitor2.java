package testvisitor2;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 访问者模式
 * 封装作用于数据结构中的各种操作，可以在不改变数据结构的前提下访问数据结构
 */

abstract class Element{
    public abstract void accept(IVisitor visitor);
    public abstract void doSomething();
}

interface IVisitor {
     void visit(ConcreteElement1 el1);
     void visit(ConcreteElement2 el2);
}

class ConcreteElement1 extends Element{

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }

    public  void doSomething(){
        System.out.println("这是元素1！");
    }
}

class ConcreteElement2 extends Element{

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }

    public  void doSomething(){
        System.out.println("这是元素2！");
    }
}

class Visitor implements IVisitor{
    public void visit(ConcreteElement1 el1){
        el1.doSomething();
    }
    public void visit(ConcreteElement2 el2){
        el2.doSomething();
    }
}

class ObjectStruture {

    public static List getList(){
        List list = new ArrayList();
        Random ran = new Random();

        for(int i=0; i<10; i++){
            int a = ran.nextInt(100);
            if(a>50){
                list.add(new ConcreteElement1());
            }else{
                list.add(new ConcreteElement2());
            }
        }
        return list;
    }
}

public class TestVisitor2 {
    public static void main(String[] args){
        List list = ObjectStruture.getList();
        for(int i=0;i<list.size();i++){
            Element e=new ConcreteElement1();
            e.accept(new Visitor());
        }
    }
}
