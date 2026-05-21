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
    public void reorderList(ListNode head) {
    //     List<ListNode> nodes = new ArrayList<>();
    //     ListNode cur = head;

    //     while(cur!=null){
    //         nodes.add(cur);
    //         cur=cur.next;
    //     }
    //     int i = 0 ;
    //     int j = nodes.size()-1;
    //     while(i<j){
    //         nodes.get(i).next = nodes.get(j);
    //         i++;

    //         if(i>=j){
    //             break;
    //         }
    //         nodes.get(j).next = nodes.get(i);
    //         j--;
    //     }
    //     nodes.get(i).next = null;

    ListNode slow = head;
    ListNode fast = head.next;

    while(fast!=null && fast.next!=null){
        fast = fast.next.next;
        slow = slow.next;
    }

    ListNode second = slow.next;
    ListNode prev = slow.next=null;
    while(second!=null){
        ListNode temp = second.next;
        second.next = prev;
        prev = second;
        second = temp;
    }
    ListNode first = head;
    second = prev;
    while(second!=null) { // exhaust the second list completely
    ListNode temp1 = first.next;
    ListNode temp2 = second.next;

    //joining one list with another reversed list alternatively
    first.next = second;
    second.next = temp1;

    // move forward
    first = temp1;
    second = temp2;

    }
    
    }
}
