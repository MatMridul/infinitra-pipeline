#include <stdio.h>
int main()
{
    int myAge, votingAge=18;
    printf("Enter your age:");
    scanf("%d",&myAge);
    if (myAge >= votingAge){
    printf("You can vote");}
    else {
    printf("You cannot vote");}
    return 0;
}