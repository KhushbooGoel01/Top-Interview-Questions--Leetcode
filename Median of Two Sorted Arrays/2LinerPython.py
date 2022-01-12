class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        v = sorted(nums1+nums2)
        return v[len(v)//2] if len(v)&1 else (v[len(v)//2-1]+v[len(v)//2])/2
