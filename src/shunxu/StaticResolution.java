package shunxu;

public class StaticResolution {

    static abstract class Human{

    }

    static class Man extends Human{

    }

    static class Woman extends Human{

    }

    public void sayHello(Human guy){
        System.out.println("Hello guy ");
    }

    public void sayHello(Man guy){
        System.out.println("Hello man ");
    }

    public void sayHello(Woman guy){
        System.out.println("Hello woman ");
    }


    public static void main(String[] args){
        Human man=new Man();
        Human woman=new Woman();

        StaticResolution sr=new StaticResolution();
        sr.sayHello(man);//hello guy
        sr.sayHello(woman);

        sr.sayHello((Man)man);//hello man
        sr.sayHello((Woman) woman);
    }

}
