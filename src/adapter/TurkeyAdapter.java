package adapter;

/**
 * 鸭子（Duck）和火鸡（Turkey）拥有不同的叫声，Duck 的叫声调用 quack() 方法，而 Turkey 调用 gobble() 方法。
 *
 * 要求将 Duck 的 quack() 方法适配成 Turkey 的 gobble() 方法，从而让鸭子冒充火鸡！
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

}