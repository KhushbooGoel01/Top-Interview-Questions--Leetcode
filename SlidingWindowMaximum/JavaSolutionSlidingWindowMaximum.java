# Question Link: https://leetcode.com/problems/sliding-window-maximum/

public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        int i=0,j=0;
        int K=0;
        ArrayDeque<Integer> q=new ArrayDeque<>();
        while(j<n){
            //calculation
            if(!q.isEmpty()){
                while(!q.isEmpty() && q.getLast()<nums[j]){
                    q.pollLast();
                }
            }
            q.add(nums[j]);
            
            if(j-i+1<k)
                j++;
            else if(j-i+1==k){
                res[K]=q.peek();
                K++;
                //remove calculation
                if(nums[i]==q.peek())
                    q.remove();
                i++;
                j++;
            }
            
        }
        return res;
    }
