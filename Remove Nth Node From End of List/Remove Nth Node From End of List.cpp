//Question Link:https://leetcode.com/problems/remove-nth-node-from-end-of-list/

 class Solution {
 public:
     ListNode* removeNthFromEnd(ListNode* head, int n) {
         if(!head||head->next==NULL&&n==1) return NULL;
         ListNode *slow,*fast;
         slow=head;
         int length=0;
         while(slow){
             length++;
             slow=slow->next;
         }
         length=length-n;
         if(length){
             slow=head;
             length--;
             while(length--){
                 slow=slow->next;
             }
             slow->next=slow->next->next;
             return head;
         }
         return head->next;
     }
 };
