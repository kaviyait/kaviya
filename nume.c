#include <stdio.h>
 
int reversDigits(int n)
{
    int rev_n = 0;
    while(n > 0)
    {
        rev_n = rev_n*10 + n%10;
        n = n/10;
    }
    return rev_n;
}
 
int main()
{
    int n = 4562;
    printf("Reverse of no. is %d", reversDigits(n));
 
    getchar();
    return 0;
}
