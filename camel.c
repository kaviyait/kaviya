#include <stdio.h> 
int main() {
    char arr[100];
    int f, i, l;
 
    printf("Enter the sentence \n");
    gets(arr);
    
    for(l=0; l<arr[l]!='\0'; l++);

    if(arr[0] >='a' && arr[0]<='z') {  
        arr[0] = arr[0]  - 32;
    }
    for(i=1; i<l; i++) {
        if(arr[i] == ' '){
            if(arr[i+1] >='a' && arr[i+1]<='z'){
            int j = i + 1;
            arr[j] = arr[j] - 32;
            }
        }
    }
    printf("%s",arr);
    return 0;
}
