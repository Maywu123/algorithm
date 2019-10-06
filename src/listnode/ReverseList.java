package listnode;

import org.junit.jupiter.api.Test;

/**
*逆转前: 1 -> 2 -> 3 -> 4 -> 5 -> null
*逆转后: 5 -> 4 -> 3 -> 2 -> 1 -> null
 */
public class ReverseList {

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;
        //head为当前节点，如果当前节点为空的话，那就什么也不做，直接返回null；
        ListNode pre = null;
        ListNode next = null;

        while (head != null) {
            //做循环，如果当前节点不为空的话，始终执行此循环，此循环的目的就是让当前节点从指向next到指向pre
            //如此就可以做到反转链表的效果
            //转所指方向，但反转之后如果不用next节点保存next1节点的话，此单链表就此断开了
            //所以需要用到pre       //先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
            next = head.next;
            //保存完next，就可以让head从指向next变成指向pre了，代码如下
            head.next = pre;
            //head指向pre后，就继续依次反转下一个节点
            //让pre，head，next依次向后移动一个节点，继续下一次的指针反转
            pre = head;
            head = next;
        }
        //如果head为null的时候，pre就为最后一个节点了，但是链表已经反转完毕，pre就是反转后链表的第一个节点
        //直接输出pre就是我们想要得到的反转后的链表
        return pre;
    }


    @Test
    public void test(){
        ListNode head=new ListNode(2);
        ListNode next=new ListNode(5);
        ListNode u=new ListNode(9);
        head.next=next;
        next.next=u;

        ListNode kk=reverse(head);
        System.out.println(kk);

    }
}
