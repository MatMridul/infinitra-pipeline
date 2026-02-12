#include <stdio.h>
int main() 
{
    int doorCode; 
    printf("Enter your door code:");
    scanf("%d", &doorCode); 
    
    (doorCode == 1035) ? printf("Welcome home sir") : printf("Sorry, you have entered the wrong code.\n");
    return 0;
}