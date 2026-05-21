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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Solving using the dumnode
        ListNode dummy = new ListNode(0);
        ListNode Node =  dummy;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                Node.next = list1;
                list1=list1.next;
            }else{
                Node.next = list2;
                list2 = list2.next;
            }
            Node = Node.next;
        }

        if(list1!=null){
            Node.next = list1;
        }else{
            Node.next = list2;
        }
        return dummy.next;
    }
}