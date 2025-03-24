/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
         return false;
         List<ListNode> lst = new ArrayList<>();
         while(head!=null){
            if(!lst.contains(head.next)){
                lst.add(head.next);
                head=head.next;
            }
            else{
                return true;
            }
         }
         return false;
    }
    //return false;
}