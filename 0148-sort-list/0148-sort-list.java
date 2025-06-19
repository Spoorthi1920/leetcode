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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
       // ListNode n = head;
        PriorityQueue<ListNode> p = new PriorityQueue<>(Comparator.comparingInt(n-> n.val));
       ListNode cur = head;
       while(cur!=null){
        p.add(cur);
        cur = cur.next;
       }

        ListNode d = new ListNode(-1);
        ListNode temp = d;
        while(!p.isEmpty()){
            ListNode pre = p.poll();
            pre.next = null;

            temp.next = pre;
            temp= temp.next;

        }
        return d.next;
        
    }
}