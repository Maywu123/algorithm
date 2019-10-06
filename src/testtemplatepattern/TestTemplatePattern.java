package testtemplatepattern;

/**
 * 模板方法模式，实现一个算法，把方法的一部分放到子类去实现，先实现简单的一个部分，其余逻辑到子类中
 */
abstract  class AbstractSort{
    protected abstract void sort(int[] array);

    public void showRes(int[] array){
        this.sort(array);

        System.out.println("排序结果：");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
}

class ConcreteSort extends AbstractSort{
    @Override
    protected void sort(int[] array){
        selectSort(array);
    }

    private void selectSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}

public class TestTemplatePattern {
    private static int[] arr = {10,8,23,45,12,2,34};

    public static void main(String[] args){
        AbstractSort sort = new ConcreteSort();
        sort.showRes(arr);
    }
}
