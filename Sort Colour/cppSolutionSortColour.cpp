//https://leetcode.com/problems/sort-colors/

class Solution {
public:
    void sortColors(vector<int>& arr) {
         int mid=0;
        int i=0,j=arr.size()-1;
        while(mid<=j){
            if(arr[mid]==0){
              swap(arr[i],arr[mid]);
              i++;mid++;
          }else if(arr[mid]==1){
                mid++;
          }else if(arr[mid]==2){
             swap(arr[j],arr[mid]);
                j--;
           }
       }
    }
};
