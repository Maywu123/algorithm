package finddata;

/*
找到一个n位数的数组中出现次数大于n/2的那个数，
最优解时间复杂度为O（n)
 */

public class FindData {
    public static int findData(int[] arr){
        int len=arr.length;
        int ntime=0;
        int result=0;

        for(int i=0;i<len;i++){
            if(ntime==0){
                result=arr[i];
                ntime++;
            }
            else{
                if(result == arr[i]){
                    ntime++;

                }else{
                    ntime--;
                }

            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] a=new int[]{8,7,5,5,5,5,6};
        int res=findData(a);
        System.out.println(res);
    }
}
