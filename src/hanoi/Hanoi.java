///*
//        *created by May on 2019/3/27
//*/
//import java.util.*;
//
//public class Hanoi {
//
//        public static void main(String[] args){
//            /*
//            toBin(-40);
//            toOct(-40);
//            toHex(-40);
//            */
//            printRecD(5);
//
//            int[] a=new int[]{3,1,56,45,23,12};
//            int[] b=new int[a.length];
//            b=selectSort(a);
//            System.out.print(b);
//
//       }
//       public static void toBin(int num){
//            trans(num,1,1);
//       }
//    public static void toOct(int num){
//        trans(num,7,3);
//    }
//    public static void toHex(int num){
//        trans(num,15,4);
//    }
//       public static void trans(int num,int base,int offset){
//          char[] chs={'0','1','2','3'
//                 ,'4' ,'5','6','7',
//                  '8','9','A','B',
//                  'C','D','E','F'};
//          char[] arr=new char[32];
//          int pos=arr.length;
//
//          while(num!=0){
//              int temp=num & base;
//              arr[--pos]=chs[temp];
//              num=num>>> offset;
//          }
//          for(int x=pos;x<arr.length;x++){
//              System.out.print(arr[x]);
//          }
//          System.out.println();
//       }
//       public static void print99(int num){
//               for(int x=1;x<num;x++) {
//                   for (int y = 1; y <= x; y++) {
//                       System.out.print(y+"*"+x+"="+y*x+"\t");
//                   }
//                   System.out.println();
//               }
//       }
//    public static void printRecUp(int num){// *
//                                         // **
//        for(int x=0;x<num;x++) {//          ***
//            for (int y = 0; y <= x; y++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void printRecDown(int num){
//                                         // ***
//        for(int x=0;x<num;x++) {//          **
//                                         // *
//            for (int y = x; y <num; y++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void printRecD(int num){
//        // ***
//                for (int x = 0; x < num; x++) {//          等腰三角形
//                    // *
//                    for (int y = x; y < num; y++) {
//                        System.out.print(" ");
//                    }
//
//
//                    for (int y = 0; y <= x; y++) {
//                        System.out.print("*");
//                    }
//                    System.out.println();
//                }
//            }

//    public static void selectSort(int[] a){//选择排序
//            for(int x=0;x<a.length-1;x++){
//                for(int y=x+1;y<a.length;y++)
//                    if(a[x] > a[y]){
//                        int temp=a[x];
//                        a[x]=a[y];
//                        a[y]=temp;
//                    }
//            }
//    }
//
//
//
//    }
