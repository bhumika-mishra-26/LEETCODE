class Solution {

    public ListNode mergeTwoSortedLinkedList(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } 
            else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if (l1 != null) {
            temp.next = l1;
        } 
        else {
            temp.next = l2;
        }

        return dummy.next;
    }

    public ListNode partitionAndMerge(int start, int end, ListNode[] l) {

        if (start > end) {
            return null;
        }

        if (start == end) {
            return l[start];
        }

        int mid = start + (end - start) / 2;

        ListNode left = partitionAndMerge(start, mid, l);
        ListNode right = partitionAndMerge(mid + 1, end, l);

        return mergeTwoSortedLinkedList(left, right);
    }

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        return partitionAndMerge(0, lists.length - 1, lists);
    }
}