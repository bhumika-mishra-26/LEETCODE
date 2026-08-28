class Solution {
    public ListNode insertionSortList(ListNode head) {

        ListNode dummy = new ListNode(0);

        while (head != null) {

            // current node ka next save kar lo
            ListNode n = head.next;

            // sorted part mein correct position find karo
            ListNode temp = dummy;

            while (temp.next != null && temp.next.val < head.val) {
                temp = temp.next;
            }

            // head ko temp aur temp.next ke beech insert karo
            head.next = temp.next;
            temp.next = head;

            // next unsorted node
            head = n;
        }

        return dummy.next;
    }
}