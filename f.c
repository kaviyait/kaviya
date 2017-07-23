#include<stdio.h>
	 
	char* encode(char* str2) {
	   int i = 0;
	 
	   while (str2[i] != '\0') {
	      str1[i] = str2[i] - 30;  // Subtract 30 From Charcter
	      i++;
	   }
	   return (str2);
	}
	 
	int main() {
	 
	   char *str2;
	 
	   printf("\nEnter the String to be Encode : ");
	   scanf("%d",&str2);
	 
	   str1 = encode(str2);
	   printf("\nEncoded String : %s", str2);
	 
	   return 0;
}
