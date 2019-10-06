package adapter;

public class TestAdapter {
    public static void main(String[] args) {

        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();

    }

}
