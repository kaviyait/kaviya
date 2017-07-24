 #include <stdio.h>
#include <string.h>
 
int main()
{
    char string[100], reverse[100];
    int len, i, index, wordSt, wordE;
 
    printf("Enter any string: ");
    gets(string);
 
    len   = strlen(string);
    index = 0;
 
    
    wordSt = len - 1;
    wordE  = len - 1;
 
    while(wordSt > 0)
    {
      
        if(string[wordSt] == ' ')
        {
            
            i = wordSt + 1;
            while(i <= wordE)
            {
                reverse[index] = string[i];
 
                i++;
                index++;
            }
            reverse[index++] = ' ';
 
            wordE = wordSt - 1;
        }
 
        wordSt--;
    }
 
   
    for(i=0; i<=wordE; i++)
    {
        reverse[index] = string[i];
        index++;
    }
    reverse[index] = '\0'; 
 
    printf("Original string \n%s\n\n", string);
    printf("Reverse ordered words \n%s", reverse);
 
 
    return 0;
}
