#include <stdio.h>

#include <string.h>

main()

{

char n[50];

int  i, len;

int result=0;

printf("Enter a number: ");

gets(n);

len = strlen(n);

for(i=0; i<len; i++){

result = result * 10 + ( n[i] - '0' );

}

printf("%d", result);

}
