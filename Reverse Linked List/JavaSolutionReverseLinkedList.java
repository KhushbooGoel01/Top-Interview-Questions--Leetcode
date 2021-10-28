#leetcode problem link : https://leetcode.com/problems/reverse-linked-list/

class Solution {
    ListNode root=null;
    public ListNode reverseList(ListNode head) {
        reverse(head,null);
        return root;
        
    }
    void reverse(ListNode temp,ListNode previous){
        if(temp==null)
            return;
        if(temp.next==null)
            root=temp;
        reverse(temp.next,temp);
        temp.next=previous;
    }
    
    
}
