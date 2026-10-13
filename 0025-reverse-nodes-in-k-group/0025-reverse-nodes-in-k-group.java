/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int idx = 1;
        ListNode temp = head;
        List<List<Integer>> l = new ArrayList<>();
        while (temp != null) {
            List<Integer> l2 = new ArrayList<>();
            l2.add(idx);
            for (int i = 1; i < k; i++) {
                if (temp.next == null)
                    break;
                temp = temp.next;
                idx++;
            }
            if (idx - l2.get(0) + 1 == k)
                l2.add(idx);
            else
                break;
            l2.add(idx);
            l.add(l2);
            temp = temp.next;
            idx++;
        }
        for (int i = 0; i < l.size(); i++) {
            head = reverseBetween(head, l.get(i).get(0), l.get(i).get(1));
        }
        return head;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        ListNode l = head;
        ListNode r = null;
        ListNode prev = null;
        ListNode rnext = null;
        int ct = 1;
        while (temp != null) {
            if (ct == left - 1)
                prev = temp;
            if (ct == left)
                l = temp;
            if (ct == right) {
                r = temp;
                rnext = r.next;
            }
            ct++;
            temp = temp.next;
        }
        ListNode x = reverseList(l, rnext);
        l.next = rnext;
        if (prev == null)
            return x;
        prev.next = x;
        return head;
    }

    public ListNode reverseList(ListNode head, ListNode r) {
        if (head == null || head.next == r)
            return head;
        ListNode temp = reverseList(head.next, r);
        if (head.next != null)
            head.next.next = head;
        head.next = null;
        return temp;
    }
}