#include <stdio.h>
#include <string.h>
#define d 256   // number of characters in input alphabet

void search(char pattern[], char text[], int q) {
    int M = strlen(pattern);
    int N = strlen(text);
    int p = 0;      // pattern hash value
    int t = 0;      // text hash value
    int h = 1;

    // Calculate h = (d^(M-1)) % q
    for (int i = 0; i < M - 1; i++)
        h = (h * d) % q;

    // Calculate hash value for pattern and first window of text
    for (int i = 0; i < M; i++) {
        p = (d * p + pattern[i]) % q;
        t = (d * t + text[i]) % q;
    }

    // Slide pattern over the text
    for (int i = 0; i <= N - M; i++) {
        if (p == t) { // If hash matches, check characters
            int j;
            for (j = 0; j < M; j++) {
                if (text[i + j] != pattern[j])
                    break;
            }
            if (j == M)
                printf("Pattern found at index %d\n", i);
        }

        // Calculate hash for next window
        if (i < N - M) {
            t = (d * (t - text[i] * h) + text[i + M]) % q;
            if (t < 0)
                t += q;
        }
    }
}

int main() {
    char text[] = "ABCCDDAEFG";
    char pattern[] = "CDD";
    int q = 101; // A prime number for hashing

    search(pattern, text, q);
    return 0;
}
