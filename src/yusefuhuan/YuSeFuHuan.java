package yusefuhuan;

public class YuSeFuHuan {
    public static void main(String[] args){

        boolean[] b=new boolean[30];
        int len=b.length;

        for(int i=0;i<len;i++){
            b[i]=true;
        }

        int index=0,count=0,flag=0;

        while(flag != 15){
            count++;
            if(count == 9){
                count=0;
                while(b[index]==false){
                    index++;
                }
                b[index]=false;
                flag++;
            }
            index++;
            if(index == len){
                index=0;
            }
        }

        int total=0;
        for(int i=0;i<len;i++){
            System.out.println(i +"的值为"+b[i]);
            if(b[i]==false)
                total++;
        }

        System.out.println();
        System.out.println("总共"+total+"个false");

    }
}
