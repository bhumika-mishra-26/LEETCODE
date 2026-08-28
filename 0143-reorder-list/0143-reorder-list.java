class Solution {

    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        return prev;
    }

    public void merge(ListNode head1, ListNode head2) {

        while (head1 != null && head2 != null) {

            ListNode temp1 = head1.next;
            ListNode temp2 = head2.next;

            head1.next = head2;
            head2.next = temp1;

            head1 = temp1;
            head2 = temp2;
        }
    }

    public void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        ListNode mid = findMiddle(head);

        ListNode new_r = reverse(mid.next);

        mid.next = null;

        merge(head, new_r);
    }
}