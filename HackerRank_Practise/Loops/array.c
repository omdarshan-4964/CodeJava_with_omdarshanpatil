#include <stdio.h>

int main() {
    int n = 5; 
    int size = n * 2 - 1; 
    int pattern[size][size];
    

    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            int min = i < j ? i : j; 
            min = min < size - i ? min : size - i - 1; 
            min = min < size - j ? min : size - j - 1; 
            pattern[i][j] = n - min; 
        }
    }
    
   
    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            printf("%d ", pattern[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}
