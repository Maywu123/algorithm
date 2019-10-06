package inner;

public class OuterClass {
    public InnerClass getInnerClass(final int num,String str ){
        return new InnerClass(){
            int number=num+3;
            public int getNumber(){
                return number;
            }
        };
    }

    public  static  void main(String[] args){
        OuterClass out=new OuterClass();
        InnerClass in=out.getInnerClass(2,"may");
        System.out.println(in.getNumber());
    }
}

interface  InnerClass{
    int getNumber();
        }
