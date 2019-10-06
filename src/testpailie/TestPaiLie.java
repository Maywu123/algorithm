package testpailie;

import java.util.Stack;

/**
 * 实现全排列，如：123,132,213,231,312,321
 */
public class TestPaiLie {
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args){
        int[] nums = {1,2,3};

        combine(nums,3,0);
    }

    /**
     * @param nums   待选择的数组
     * @param target  要选择多少个次
     * @param cur   当前选择的是第几次
     */
    public static void combine(int[] nums,int target,int cur){
        if(cur == target) {
            System.out.println(stack);
            return;
        }

        for(int i=0;i<nums.length;i++) {//123,3先出栈，然后是2.随后已经有1，到nums[2]了就是3，所以此时是1,3,2
            if(!stack.contains(nums[i])) {//然后1出栈，2进栈，2,1,3，然后2,3,1。随后3出栈，3进入，3,1, 2,    3,2,1
                stack.add(nums[i]);
                combine(nums, target, cur+1);
                stack.pop();
            }

        }
    }
}
