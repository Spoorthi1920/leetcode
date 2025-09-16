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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if(head.next==null) return head;

        
        ListNode n1 = head;
        ListNode n2 = head.next;

        while(n2!=null){
            int value = gcd(n1.val, n2.val);
            ListNode gNode = new ListNode(value);

            n1.next = gNode;
            gNode.next = n2;

            n1 = n2;
            n2 = n2.next;
        }
        return head;
        
        
    }
    public static int gcd(int a,int b){
        if(b==0) 
        return a;
        else
      return gcd(b, a%b);
    
        

    }
}