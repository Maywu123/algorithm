package duilie.DuiLie;

import java.util.LinkedList;

public class DuiLie {//队列先进先出

    private static LinkedList linkedList;

    DuiLie(){
        linkedList=new LinkedList();
    }

    public static void myAdd(Object o){
        linkedList.addFirst(o);
    }

    public static Object myGet(){
        return linkedList.removeLast();
    }

    public static boolean isNull(){
        return linkedList.isEmpty();
    }

    public static void main(String[] args){
        DuiLie duiLie=new DuiLie();

        System.out.println(duiLie.isNull());

        duiLie.myAdd("123");
        duiLie.myAdd("456");
        duiLie.myAdd("789");

        System.out.println(duiLie.isNull());

        System.out.println(duiLie.myGet());
        System.out.println(duiLie.myGet());
        System.out.println(duiLie.myGet());

        System.out.println(duiLie.isNull());
    }
}
