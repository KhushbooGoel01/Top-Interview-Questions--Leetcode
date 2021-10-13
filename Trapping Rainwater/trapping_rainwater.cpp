//Trapping rainwater problem 
// Efficient solution 
// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(N).
// Asked in Amazon Microsoft Google Flipkart
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t, n;
    //test cases
    cin >> t;
    while (t--)
    {
        //size of array
        cin >> n;
        long long arr[n];
        //adding elements
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }

        long long result = 0;

        // maximum element on left and right
        int left_max = 0, right_max = 0;

        // indices to traverse the array
        int lo = 0, hi = n - 1;

        while (lo <= hi)
        {
            if (arr[lo] < arr[hi])
            {
                if (arr[lo] > left_max)
                    // update max in left
                    left_max = arr[lo];
                else
                    // water on curr element = max - curr
                    result += left_max - arr[lo];
                lo++;
            }
            else
            {
                if (arr[hi] > right_max)
                    // update right maximum
                    right_max = arr[hi];
                else
                    result += right_max - arr[hi];
                hi--;
            }
        }

        cout << result;
    }
    return 0;
}
