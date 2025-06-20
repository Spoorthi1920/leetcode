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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        PriorityQueue<ListNode> p = new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        ListNode d = new ListNode(-1);
        ListNode temp = d;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                p.offer(lists[i]);
            }
        }
        while(!p.isEmpty()){
            ListNode n = p.poll();
            
            temp.next=n;
            temp = temp.next;

            if(n.next!=null){
                p.offer(n.next);
            }
        }
        return d.next;

        
    }
}