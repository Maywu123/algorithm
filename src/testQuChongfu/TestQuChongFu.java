package testQuChongfu;

class ListNode{
    ListNode next = null;
    int val;

    ListNode(int val){
        this.val = val;
    }

}

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */

public class TestQuChongFu {

    public static void main(String[] args){

    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }

        ListNode Head = new ListNode(0);//设置一个头结点
        ListNode pre = Head;
        ListNode last = Head.next;

        while (last != null) {
            if (last != null && last.val == last.next.val) {//找到最后一个重复的节点

                while (last != null && last.val == last.next.val) {
                    last = last.next;
                }

                pre.next = last.next;
                last = last.next;

            } else {

                pre = pre.next;
                last = last.next;

            }
        }
        return Head.next;
    }
}
