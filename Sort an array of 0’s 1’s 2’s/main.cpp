//Approach 1 : simply sort the array => TC : O(nlogn)

//Approach 2 : Counting Sort  =>  TC : O(n)

//Approach 3 :  

void sortColors(vector<int>& nums) {
        int low=0,mid=0,high=nums.size()-1;
        
        //low for 0, mid for 1, high for 2
  
        while(mid<=high){
            if(nums[mid]==0){ 
                swap(nums[mid],nums[low]);
                low++;mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums[mid],nums[high]);
                high--;
            }
        }
    }
