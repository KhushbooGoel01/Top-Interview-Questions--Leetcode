#include <stdio.h>
#define R 3
#define C 6

void spiralPrint(int m, int n, int a[R][C]) {
    int i, k = 0, l = 0;
    
    while (k < m && l < n) {

        for (i = l; i < n; ++i) {
            printf("%d, ", a[k][i]);
        }
        k++;

        for (i = k; i < m; ++i) {
            printf("%d, ", a[i][n - 1]);
        }
        n--;

        if (k < m) {
            for (i = n - 1; i >= l; --i) {
                printf("%d, ", a[m - 1][i]);
            }
            m--;
        }

        if (l < n) {
            for (i = m - 1; i >= k; --i) {
                printf("%d, ", a[i][l]);
            }
            l++;
        }
    }
    printf("\n");
}

int main() {
    int a[R][C] = {
    	{ 11, 12, 13, 14, 15, 16 },
      { 27, 28, 29, 20, 21, 22 },
      { 33, 34, 35, 36, 37, 38 }
    };

    printf("-----The spiral pattern is-----\n");
    spiralPrint(R, C, a);
    return 0;
}
