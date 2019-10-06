package teststrategy;

/**
 * 策略模式，将一组算法中的每一个算法都封装起来，
 * 并且他们之间可以互换
 */

interface IStrategy{
    void doSomething();
}

class ConcreteStrategy1 implements IStrategy{
    public void doSomething(){
        System.out.println("具体策略1");
    }
}

class ConcreteStrategy2 implements IStrategy{
    public void doSomething(){
        System.out.println("具体策略1");
    }
}

class Context{
    private IStrategy strategy;

    public Context(IStrategy iStrategy){
        this.strategy = iStrategy;
    }

    public void execute(){
        strategy.doSomething();
    }
}

public class TestStrategy {
    public static void main(String[] args){
        Context context;
        System.out.println("执行策略1:");
        context = new Context(new ConcreteStrategy1());
        context.execute();

        System.out.println("执行策略2:");
        context = new Context(new ConcreteStrategy2());
        context.execute();
    }
}
