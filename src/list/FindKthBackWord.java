package list;

public class FindKthBackWord {

    static class ListNode {
        public int data;
        public ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode findKthBackwards1(ListNode head, int k) {//先p1走k-1步，然后p1和p2同时走，直到p1的next为空
        //如果链表为空
        if (head == null) {
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = null;

        for (int i = 0; i < k; i++) {
            if (p1.next != null) {
                p1 = p1.next;
            } else
                return null;
        }

        p2 = head;
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    public static ListNode findKthBackwards2(ListNode head, int k) {//先p1走k-1步，然后p1和p2同时走，直到p1的next为空
        //先计算链表数量，然后根据规律求出倒数第k个数
        if (head == null) {
            return null;
        }

        int num = 0;
        ListNode p1 = head;
        while (p1.next != null) {
            p1 = p1.next;
            num++;
        }

        if (num < k) {
            return null;
        }

        p1=head;
        for (int i = 0; i < num - k; i++) {
            p1 = p1.next;
        }
        return p1;
    }

    public static void main(String[] args) {// 添加数据
        ListNode t1 = new ListNode(13);
        ListNode t2 = new ListNode(11);
        ListNode t3 = new ListNode(15);
        ListNode t4 = new ListNode(17);
        ListNode t5 = new ListNode(16);
        ListNode t6 = new ListNode(20);
        ListNode t7 = new ListNode(9);
        ListNode t8 = new ListNode(6);
        // 构建链表
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        t5.next = t6;
        t6.next = t7;
        t7.next = t8;

        ListNode listNode1 = findKthBackwards1(t1, 3);
        System.out.println(listNode1.data);

        ListNode listNode2 = findKthBackwards2(t1, 3);
        System.out.println(listNode2.data);
    }

}
