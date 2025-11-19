#include <stdio.h>
#include <limits.h>

#define N 10

void OBST(int n, float p[], float q[]) {
    float w[N][N], c[N][N];
    int r[N][N];

    for (int i = 0; i <= n; i++) {
        w[i][i] = q[i];
        c[i][i] = 0;
        r[i][i] = 0;
    }

    for (int l = 1; l <= n; l++) {
        for (int i = 0; i <= n - l; i++) {
            int j = i + l;
            w[i][j] = w[i][j-1] + p[j] + q[j];
            c[i][j] = INT_MAX;

            for (int k = i+1; k <= j; k++) {
                float t = c[i][k-1] + c[k][j] + w[i][j];
                if (t < c[i][j]) {
                    c[i][j] = t;
                    r[i][j] = k;
                }
            }
        }
    }

    printf("Cost of OBST = %.2f\n", c[0][n]);
    printf("Root of OBST = %d\n", r[0][n]);
}

int main() {
    int n = 3;
    float p[] = {0, 0.15, 0.10, 0.05}; // p[1..n]
    float q[] = {0.05, 0.10, 0.05, 0.05}; // q[0..n]

    OBST(n, p, q);
    return 0;
}
