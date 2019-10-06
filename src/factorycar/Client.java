package factorycar;

/**
 * 有2节车厢和3节车厢的车，2节的有2.0和2.2排量，3也有2.0和2.2的 *
 */

interface IProduct1 {
    public void show();
}

interface IProduct2 {
    public void show();
}

class Product1 implements IProduct1 {
    public void show() {
        System.out.println("这是1型产品");
    }
}

class Product2 implements IProduct2 {
    public void show() {
        System.out.println("这是2型产品");
    }
}

interface IFactory {
    public IProduct1 createProduct1();
    public IProduct2 createProduct2();
}

class Factory implements IFactory{

    public IProduct1 createProduct1() {
        return new Product1();
    }

    public IProduct2 createProduct2() {
        return new Product2();
    }

}

public class Client {
    public static void main(String[] args){
        IFactory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}