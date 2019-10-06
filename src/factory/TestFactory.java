package factory;

interface IProduct{
    void productMethod();
}

class Product1 implements IProduct{
    @Override
    public void productMethod(){
        System.out.println("产品1！");
    }
}

class Product2 implements IProduct{
    @Override
    public void productMethod(){
        System.out.println("产品2！");
    }
}

interface IFactory{
    IProduct createProduct();

}

class Factory implements IFactory{
    @Override
    public IProduct createProduct(){
        return new Product2();
    }
}

public class TestFactory {
    public static void main(String[] args){
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();
    }
}
