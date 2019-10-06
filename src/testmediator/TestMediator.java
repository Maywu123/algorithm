package testmediator;

///**
// * 不是中介者模式
// */
//abstract class AbstractColleague {
//    protected int number;
//
//    public int getNumber() {
//        return number;
//    }
//
//    public void setNumber(int number){
//        this.number = number;
//    }
//    //抽象方法，修改数字时同时修改关联对象
//    public abstract void setNumber(int number, AbstractColleague coll);
//}
//
//class ColleagueA extends AbstractColleague{
//    public void setNumber(int number, AbstractColleague coll) {
//        this.number = number;
//        coll.setNumber(number*100);
//    }
//}
//
//class ColleagueB extends AbstractColleague{
//
//    public void setNumber(int number, AbstractColleague coll) {
//        this.number = number;
//        coll.setNumber(number/100);
//    }
//}
//
//public class TestMediator {
//    public static void main(String[] args){
//
//        AbstractColleague collA = new ColleagueA();
//        AbstractColleague collB = new ColleagueB();
//
//        System.out.println("==========设置A影响B==========");
//        collA.setNumber(1288, collB);
//        System.out.println("collA的number值："+collA.getNumber());
//        System.out.println("collB的number值："+collB.getNumber());
//
//        System.out.println("==========设置B影响A==========");
//        collB.setNumber(87635, collA);
//        System.out.println("collB的number值："+collB.getNumber());
//        System.out.println("collA的number值："+collA.getNumber());
//    }
//}


/**
 * 中介者模式
 */
abstract class AbstractColleague {
    protected int number;

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public abstract void setNumber(int number,AbstractMediator am);
}

class ColleagueA extends AbstractColleague{

    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.AaffectB();
    }
}

class ColleagueB extends AbstractColleague{

    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}

abstract class AbstractMediator {

    protected AbstractColleague A;
    protected AbstractColleague B;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }

    public abstract void AaffectB();

    public abstract void BaffectA();

}

class Mediator extends AbstractMediator {

    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }

    //处理A对B的影响
    public void AaffectB() {
        int number = A.getNumber();
        B.setNumber(number*100);
    }

    //处理B对A的影响
    public void BaffectA() {
        int number = B.getNumber();
        A.setNumber(number/100);
    }
}

public class TestMediator {
    public static void main(String[] args){
        AbstractColleague collA = new ColleagueA();
        AbstractColleague collB = new ColleagueB();

        AbstractMediator am = new Mediator(collA, collB);

        System.out.println("==========通过设置A影响B==========");
        collA.setNumber(1000, am);
        System.out.println("collA的number值为："+collA.getNumber());
        System.out.println("collB的number值为A的100倍："+collB.getNumber());
        System.out.println();

        System.out.println("==========通过设置B影响A==========");
        collB.setNumber(1000, am);
        System.out.println("collB的number值为："+collB.getNumber());
        System.out.println("collA的number值为B的0.01倍："+collA.getNumber());

    }
}