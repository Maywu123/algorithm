package paixu;

import java.util.Arrays;
import java.util.ArrayList;

public class Paixu {
    public static  void main(String[] args) {

        int[] array = {1,8, 56, 12, 38, 7, 9, 24,89};

        selectSort(array);
        System.out.println(Arrays.toString(array));

        bubbleSort(array);
        System.out.println(Arrays.toString(array));

        shellSort(array);
        System.out.println(Arrays.toString(array));

        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

        radixSort(array);
        System.out.println(Arrays.toString(array));

    }


    public static void selectSort(int[] a){//选择排序
            for(int x=0;x<a.length-1;x++){
                for(int y=x+1;y<a.length;y++)
                    if(a[x] > a[y]){
                        swap(a,x,y);
                    }
            }
    }


    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < a.length - 1 - i; j++) {//内层循环次数
                if (a[j] > a[j + 1]) {
                    swap(a,j,j+1);
                }
            }
        }
    }


    public static void insertSort(int[] a) {
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){//内层次数
                if(a[j-1] > a[j]){//前一个大于后一个就交换位置，前面也一样
                    swap(a,j-1,j);
                }
            }
        }
    }


    public static void shellSort(int[] a) {
        for(int gap=a.length/2; gap>0; gap/=2){//从第gap个元素，逐个对其所在组进行直接插入排序操作
            for(int i=gap;i<a.length;i++){
                int j = i;
                while(j-gap>=0 && a[j-gap]>a[j]){
                    //插入排序采用交换法
                    swap(a,j-gap,j);
                    j-=gap;
                }
            }
        }
    }


    public static void heapSort(int[] a){
        for(int i=a.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustBigHeap(a,i,a.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=a.length-1;j>0;j--){
            swap(a,0,j);//将堆顶元素与末尾元素进行交换
            adjustBigHeap(a,0,j);//重新对堆进行调整
        }

    }
    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustBigHeap(int[] arr,int i,int length){
        int temp = arr[i];//先取出当前元素i
        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
            if(k+1<length && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if(arr[k] >temp){//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }


    public static void quickSort(int[] arr,int low,int high){
            int i=low,j=high;
            if(low>high){
                return;
            }
            //temp就是基准位
            int key = arr[low];

            while (i<j) {
                //先看右边，依次往左递减，往前找一个比基数小的数
                while (arr[j]>=key && i<j) {
                    j--;
                }
                //再看左边，依次往右递增,往后找一个大于基数的数
                while (arr[i]<=key && i<j) {
                    i++;
                }
                //如果满足条件则交换
                if (i<j) {
                    swap(arr,i,j);
                }
            }
            //最后将基准为与i和j相等位置的数字交换
            arr[low] = arr[i];
            arr[i] = key;

            //递归调用左半数组
            quickSort(arr, low, j-1);
            //递归调用右半数组
            quickSort(arr, j+1, high);
    }


    public static void mergeSort(int[] arr,int left,int right){
        int[] temp=new int[arr.length];

        if(left<right){
            int mid = (left+right)>>1;
            mergeSort(arr,left,mid);//左边归并排序，使得左子序列有序
            mergeSort(arr,mid+1,right);//右边归并排序，使得右子序列有序
            merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
        }
    }

    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针

        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }

    private static void radixSort(int[] array) {
        if (array == null || array.length < 2)
            return ;
        // 1.先算出最大数的位数；
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        int maxDigit = 0;
        while (max != 0) {
            max /= 10;
            maxDigit++;
        }
        int mod = 10, div = 1;
        ArrayList<ArrayList<Integer>> bucketList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 10; i++)
            bucketList.add(new ArrayList<Integer>());

        for (int i = 0; i < maxDigit; i++, mod *= 10, div *= 10) {
            for (int j = 0; j < array.length; j++) {
                int num = (array[j] % mod) / div;
                bucketList.get(num).add(array[j]);
            }
            int index = 0;
            for (int j = 0; j < bucketList.size(); j++) {
                for (int k = 0; k < bucketList.get(j).size(); k++)
                    array[index++] = bucketList.get(j).get(k);
                bucketList.get(j).clear();
            }
        }
    }


    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}

