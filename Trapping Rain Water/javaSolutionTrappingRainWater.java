#Question link - https://leetcode.com/problems/trapping-rain-water/

public int trap(int[] height) {
        int n=height.length;
        if(n<=2)
            return 0;
        int maxLeft=height[0];
        int maxRight=height[n-1];
        int water=0;
        int left=1,right=n-2;
        while(left<=right){
            if(maxLeft<maxRight){
                if(height[left]>=maxLeft)
                    maxLeft=height[left];
                else
                    water+=maxLeft-height[left];
                left+=1;
            }
            else{
                if(height[right]>maxRight)
                    maxRight=height[right];
                else
                    water+=maxRight-height[right];
                right-=1;
            }
        }
        return water;
    }
