#include<stdio.h>
int main()
{
long long n;
int count=0;
printf("enter any number");
scanf("%d"&n);
while(n!=0)
{
count++;
n/=10;
}
printf("total digits:%d,count);
return 0;
}
