//Question Link:https://leetcode.com/problems/remove-nth-node-from-end-of-list/



/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head,  int n) {
        ListNode*p=head,*q=head;
        if(head==NULL)
            return NULL;
        for(int i=0;i<n;i++)
        {
            if(p->next==NULL)
            {
                head=head->next;
                return head;
            }
            p=p->next;
        }
        while(p->next!=NULL)
        {
            p=p->next;
            q=q->next;
        }
        q->next=q->next->next;
        return head;
        
    }
};