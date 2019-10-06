package strategytest;

public class TestStrategy {
    public static void main(String[] args) {

        Duck duck = new Duck();

        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}
