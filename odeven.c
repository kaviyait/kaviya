#include<stdio.h>
int main()
{
har str10], even[10], odd[10], i, j, k,c;

i = j = k = c = 0;

do
{
    printf("Enter your input string:");
    fgets(str, 10, stdin);
    str[strlen(str) - 1] = '\0';


    printf("Given Input string:%s\n", str);

    while (str[i] != '\0')
    {
        if (i % 2 == 0) {
            odd[j++] = str[i];
        }
        else {
            even[k++] = str[i];
        }
        i++;
    }
  
    odd[j] = even[k] = '\0';

    printf(" %s %s", odd,even);

    odd[0]=even[0]='\0';
    c++;
}while(c<2);
return 0;
}
