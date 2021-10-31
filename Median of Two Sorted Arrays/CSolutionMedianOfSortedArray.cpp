
double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size){
    
  if(nums2Size < nums1Size) {
            
            return findMedianSortedArrays(nums2, nums2Size, nums1, nums1Size);
        }
        
        int low = 0, high = nums1Size;
        
        while(low <= high) {
            
            int mid = (low+high)/2;
            int mid1 = (nums1Size+nums2Size+1)/2-mid;
            
            int l1 = mid == 0 ? INT_MIN : nums1[mid-1];
            int l2 = mid1 == 0 ? INT_MIN : nums2[mid1-1];
            
            int r1 = mid == nums1Size ? INT_MAX : nums1[mid];
            int r2 = mid1 == nums2Size ? INT_MAX : nums2[mid1];
            
            if(l1 <= r2 && l2 <= r1) {
                
                if(nums1Size%2 == nums2Size%2) {
                    
                    return (double)(fmax(l1, l2) + fmin(r1, r2))/2;
                }
                else {
                    
                    return (double)fmax(l1, l2);
                }
            }
            else if(l1 > r2) {
                
                high = mid-1;
            }
            else {
                
                low = mid+1;
            }
        }
        
        return 0.0;
}
