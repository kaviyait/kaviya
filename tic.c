#include <stdio.h> 
#include <conio.h> 
#include <stdlib.h>
#include <string.h>

void initialize();
void reserve(); 

struct passengers {

char* firstname;    
char* surname;
char* passport;
};

passengers passenger[10]; 


void initialize()
{
for (int i = 0; i < 10; i++) {

    passenger[a].passport = "";
    passenger[a].firstname = "";
    passenger[a].surname = "";

 }

 }
 void pause()
 {
printf("\n");
system("pause");
system("cls");
}


int main()  {

int seat = 0;

initialize();

int choice;

do {
    system("cls");
    printf("\n\n\t\t*************************************\n\n");
    printf("\t  *****Welcome To airline reservation system*****\n\n"); 
    printf("\t\t\t   ******************");
    printf("\n\n\t\t  1. RESERVE SEAT");
    printf("\n\n\t\t  2. CANCEL SEAT");
    printf("\n\n\t\t  3. DISPLAY SEAT LAYOUT");
    printf("\n\n\t\t  4. EXIT SYSTEM");
    scanf_s("%d", &choice); fflush(stdin);


    switch (choice) {

    case 1: reserve();
        break;
    case 2: cancel();
        break;
    case 3: display();
        break;
    case 4: exit(0);
        break;
    default:
        printf("\nInvalid Choice");
    }

 } while (choice != 4);



getch(); 

 }


 void reserve()   
{
int seat = 0;
passenger[seat].firstname = (char*)malloc(15);
passenger[seat].surname = (char*)malloc(15);
passenger[seat].passport = (char*)malloc(9);

for (int i = 0; i < 10; i++)   
{

    if (passenger[i].passport == "")
    {
        seat = i; 
        break;
    }


}

if (seat < 10)
{
    printf("\n\t\t Enter First Name:");
    scanf_s("%s", passenger[seat].firstname);

    printf("\n\t\t Enter Surname:");
    scanf_s("%s", passenger[seat].surname);

    printf("\n\t\t Enter Passport Number:");
    scanf_s("%s", passenger[seat].passport);


}
else {

    printf("\n\t\t Sorry, No seats are available");


}

pause();

}
