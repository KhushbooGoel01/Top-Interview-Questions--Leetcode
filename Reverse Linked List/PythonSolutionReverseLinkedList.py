## Reverse Linked List Problem Leetcode link : https://leetcode.com/problems/reverse-linked-list


"""
Reverse a singly linked list.


Example:


Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:


A linked list can be reversed either iteratively or recursively. Could you implement both?
"""


# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

## Let's do it iteratively
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return None
        prev = None
        curr = head
        while curr:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        return prev


# Time Complexity: O(n)
# Space Complexity: O(1)


## Let's do it recursively
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        new_head = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return new_head


# Time Complexity: O(n)
# Space Complexity: O(n)


## Let's do it iteratively


# Time Complexity: O(n)
# Space Complexity: O(1)




def main():
    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    head.next.next.next = ListNode(4)
    head.next.next.next.next = ListNode(5)
    head.next.next.next.next.next = None

    print(Solution().reverseList(head))




if __name__ == "__main__":
     main()
