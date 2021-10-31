// Problem link: https://leetcode.com/problems/first-bad-version/

//Approch: Binary Search

// Time:  O(logn)
// Space: O(1)

// Forward declaration of isBadVersion API.
bool isBadVersion(int version);

class Solution {
    public:
    int firstBadVersion(int n) {
        long long int beg,last,mid;
        beg = 1 , last = n;
        long int pos = 1;
        while(beg<=last){
            mid = beg + (last-beg)/2;
            bool x = isBadVersion(mid);
            if(x == true){
                pos = mid;
                last = mid-1;
            }
            else
                beg = mid+1;
        }
        return pos;
    }
};