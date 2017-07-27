#include<stdio.h>
#include<conio.h>
void main()
{
   int i, j, k;
   char s[100];
   char rev[100];
   printf("Enter a string\t");
   scanf("%s", s);
   printf("The original string is %s\n", s);
   for(i = 0; s[i] != '\0'; i++);
   {
      k = i-1;
   }
   for(j = 0; j <= i-1; j++)
   {
      rev[j] = s[k];
      k--;
   }
   printf("The reverse string is %s\n", rev);
   getch();
}
