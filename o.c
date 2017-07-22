#include,stdio.h>
int main()
{
int i,n,s=0;
printf("enter the integer number/n");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
s=s+i;
}
printf("sum of first %d  natural numbers=%d/n",n,s);
return 0;
}
