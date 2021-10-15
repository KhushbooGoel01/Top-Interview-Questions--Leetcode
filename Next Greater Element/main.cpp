Input: 
N = 4, arr[] = [1 3 2 4]
Output:
3 4 4 -1
  
//Approach 1 : Brute force TC: O(n^2)
  
//Approach 2 : Using stack TC: O(n)
  
vector<long long> nextLargerElement(vector<long long> arr, int n){
        // Your code here
        vector<long long> ans;
        stack<long long>s;
        for(int i=n-1;i>=0;i--){
            if(s.size()==0)
                ans.push_back(-1);
            else if(s.size()>0 && s.top()>arr[i])
                ans.push_back(s.top());
            else{
                while(s.size()>0 && s.top()<=arr[i])
                    s.pop();
                if(s.size()==0)
                    ans.push_back(-1);
                else
                    ans.push_back(s.top());
            }
            s.push(arr[i]);
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
