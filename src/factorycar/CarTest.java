//package factorycar;
//
///**
// * 组装汽车，假设由发动机，底盘和车轮组合成。
// */
//class Engine {
//    public void getStyle(){
//        System.out.println("这是汽车的发动机");
//    }
//}
//
//class Underpan {
//    public void getStyle(){
//        System.out.println("这是汽车的底盘");
//    }
//}
//
//class Wheel {
//    public void getStyle(){
//        System.out.println("这是汽车的轮胎");
//    }
//}
//
//interface ICar{
//    ICar Car(Engine e,Underpan u,Wheel w);
//    void show();
//}
//
//class Car implements ICar{
//    private Engine e;
//    private Underpan u;
//    private Wheel w;
//
//    ICar Car(Engine e,Underpan u,Wheel w){
//        this.e=e;
//        this.u=u;
//        this.w=w;
//    }
//
//    public void show(){
//        System.out.println("这是一辆车！");
//    }
//}
////耦合度高！！!
////public class CarTest {
////
////    public static void main(String[] args) {
////        Engine engine = new Engine();
////        Underpan underpan = new Underpan();
////        Wheel wheel = new Wheel();
////        ICar car = new Car(underpan, wheel, engine);
////        car.show();
////    }
////}
//
//interface IFactory {
//    public ICar createCar();
//}
//
//class Factory implements IFactory {
//    public ICar createCar() {
//        Engine engine = new Engine();
//        Underpan underpan = new Underpan();
//        Wheel wheel = new Wheel();
//        ICar car = new Car(engine,underpan, wheel);
//        return car;
//    }
//}
//
//public class CarTest {
//    public static void main(String[] args) {
//        IFactory factory = new Factory();
//        ICar car = factory.createCar();
//        car.show();
//    }
//}
//
