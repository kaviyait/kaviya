#include<stdio.h>
void main(void)
{
  char str1[25],str2[25];
  int x=0,y=0;
  printf("\nEnter First String:");
  gets(str1);
  printf("\nEnter Second String:");
  gets(str2);
  while(str1[x]!='\0')
  x++;
  while(str2[y]!='\0')
  {
    str1[x]=str2[y];
    y++;
    x++;
  }
  str1[x]='\0';
  printf("\nConcatenated String is %s",str1);
}
