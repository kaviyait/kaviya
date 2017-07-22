#include<stdio.h>
int main()
{
int n,i=1,cal;
printf("enter the positive number");
scanf("%d",&n);
for(i=1;i<=n;++i)
{
cal+=i;
}
printf("cal=%d",cal);
return 0;
}
