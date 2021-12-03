# Remove nth node from end of list
# Given a linked list, remove the nth node from the end of list and return its head.


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head is None:
            return None
        if head.next is None:
            return None
        if n == 0:
            return head
        if n == 1:
            return head.next
        current = head
        count = 0
        while current is not None:
            current = current.next
            count += 1
        if count == n:
            return head.next
        current = head
        for i in range(count - n - 1):
            current = current.next
        current.next = current.next.next
        return head


def main():
     head = ListNode(1)
     head.next = ListNode(2)
     head.next.next = ListNode(3)
     head.next.next.next = ListNode(4)
     head.next.next.next.next = ListNode(5)
     print(Solution().removeNthFromEnd(head, 2))


if __name__ == '__main__':
     main()
     