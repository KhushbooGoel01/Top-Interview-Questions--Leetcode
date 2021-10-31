from heapq import *
class Solution:
    def mergeKLists(self, lists: List[ListNode]) -> ListNode:
        n=len(lists)
        heap = []
        for i in range(n):
            if lists[i] != None:
                heappush(heap, (lists[i].val, i))
        
        ans = root = None
        while(heap):
            v, i = heappop(heap)
            if ans == None: ans = root = ListNode(v)
            else: 
                ans.next = ListNode(v)
                ans=ans.next
            lists[i] = lists[i].next
            if lists[i] != None:
                heappush(heap, (lists[i].val, i))
                
        return root
