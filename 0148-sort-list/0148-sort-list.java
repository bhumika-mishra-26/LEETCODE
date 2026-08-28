class Solution {

    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }

    public ListNode mergeSortedLinkedList(ListNode head1, ListNode head2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (head1 != null && head2 != null) {

            if (head1.val <= head2.val) {
                curr.next = head1;
                head1 = head1.next;
            } 
            else {
                curr.next = head2;
                head2 = head2.next;
            }

            curr = curr.next;
        }

        if (head1 != null) {
            curr.next = head1;
        }

        if (head2 != null) {
            curr.next = head2;
        }

        return dummy.next;
    }

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode midd = findMiddle(head);

        ListNode second = midd.next;
        midd.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(second);

        return mergeSortedLinkedList(left, right);
    }
}