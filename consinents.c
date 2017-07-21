#include<stdio.h>
int main()
{
char a;
int l,u;
printf("enter a alphabet");
scanf("%d",a);
l=(a=='a'||a=='i'||a=='o'||a=='e'||a=='u');
u=(a=='A'||a=='I'||a=='O'||a=='E'||a=='U');
if(l||u)
{
printf("%c is vowel",a);
}
else
{
printf("%c is consonenets",a);
}
return 0;
}
