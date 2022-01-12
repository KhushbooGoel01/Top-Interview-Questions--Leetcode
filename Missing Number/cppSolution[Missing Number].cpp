#include<bits/stdc++.h>
using namespace std;
 
int getMissingNo(int a[] ,
                 int n)
{
  int n_elements_sum = n * (n + 1) / 2 ;
  int sum = 0;
 
  for(int i = 0; i < n - 1; i++)
    sum += a[i];
  return n_elements_sum-sum;
}
 
int main()
{
  int a[] = {1, 2, 4, 5, 6};
  int n = sizeof(a) /
          sizeof(a[0]) + 1;
  int miss = getMissingNo(a, n);
  cout << (miss);
  return 0;
}
 
