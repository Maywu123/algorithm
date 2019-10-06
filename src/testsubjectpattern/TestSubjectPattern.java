package testsubjectpattern;

import java.util.Vector;

/**
 * 观察者模式，当被观察者的状态改变，那么观察者就会收到通知并且更新
 */
//abstract class Subject{
//    private Vector obs = new Vector();
//
//    public void addObserver(Observer obs){
//        this.obs.add(obs);
//    }
//
//    public void detach(Observer o){
//        this.obs.remove(o);
//    }
//
//    protected void notifyObserver(){
//        for(Observer o : obs){
//            o.update();
//        }
//    }
//
//    public abstract void doSomething();
//}
//
//class ConcreteSubject extends Subject {
//    public void doSomething(){
//        System.out.println("被观察者事件反生");
//        this.notifyObserver();
//    }
//}
//
//interface Observer {
//     void update();
//}
//
//class ConcreteObserver1 implements Observer {
//    public void update() {
//        System.out.println("观察者1收到信息，并进行处理。");
//    }
//}
//
//class ConcreteObserver2 implements Observer {
//    public void update() {
//        System.out.println("观察者2收到信息，并进行处理。");
//    }
//}
//
//public class TestSubjectPattern {
//    public static void main(String[] args){
//
//        Subject sub = new ConcreteSubject();
//
//        sub.addObserver(new ConcreteObserver1()); //添加观察者1
//        sub.addObserver(new ConcreteObserver2()); //添加观察者2
//
//        sub.doSomething();
//    }
//}
