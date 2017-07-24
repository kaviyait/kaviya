#include <stdio.h>
#include <math.h> 
 
int main()
{
    long long n;
    int c = 0;
 
    printf("Enter any number: ");
    scanf("%lld", &n);
 
    c = log10(n) + 1;
 
    printf("Total digits: %d", c);
 
    return 0;
}
