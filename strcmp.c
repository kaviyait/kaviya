#include<stdio.h>

int main() {
   char str0[30], str1[30];
   int i;

   printf("\nEnter two strings :");
   gets(str0);
   gets(str1);

   i = 0;
   while (str0[i] == str1[i] && str0[i] != '\0')
      i++;
   if (str0[i] > str1[i])
      printf("str0 > str1");
   else if (str0[i] < str1[i])
      printf("str0 < str1");
   else
      printf("str0 = str1");

   return (0);
}
