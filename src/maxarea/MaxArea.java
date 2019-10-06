package maxarea;

public class MaxArea {
    public static void main(String[] args){

        int[] a={2,1,5,6,2,3};
        int res=maxArea(a);
        System.out.println(res);
    }

    public static int maxArea(int[] arr){
        int maxA=arr[0];
        for(int i=0;i<arr.length;i++){
            int min=arr[i]; //记录当前条图及之前最小值
            int w=0;//底部边长

            for(int j=i;j>=0;j--){
                w++;
                if(min>arr[j]){
                    min=arr[j];
                }
                int res=w*min;
                if(maxA < res){
                    maxA=res;
                }
            }
        }
        return maxA;
    }
}
