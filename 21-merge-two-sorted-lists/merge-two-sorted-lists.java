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
        ListNode l = new ListNode();
        ListNode d = l;

        while(list1!=null&&list2!=null){
            d.next = new ListNode();
            d = d.next;
            if(list1.val<list2.val){
                d.val = list1.val;
                list1 = list1.next;
            }
            else if(list1.val>list2.val){
                d.val = list2.val;
                list2 = list2.next;
            }
            else{
                d.val = list1.val;
                list1 = list1.next;
                d.next = new ListNode();
                d = d.next;
                d.val = list2.val;
                list2 = list2.next;
            }
            
        }
        while(list1!=null){
            d.next = new ListNode();
            d = d.next;
            d.val = list1.val;
            list1 = list1.next;
        }
        while(list2!=null){
            d.next = new ListNode();
            d = d.next;
            d.val = list2.val;
            list2 = list2.next;
        }
        return l.next;
    }
}