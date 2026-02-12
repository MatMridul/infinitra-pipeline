#include <stdio.h>
int main()
{
    int day;
    printf("enter day:");
    scanf("%d",&day);
    if (day<8)
    {
       switch(day)
      {
        case 1:
        printf("Monday");
        break;

        case 2:
        printf("Tuesday");
        break;

        case 3:
        printf("Wednesday");
        break;

        case 4:
        printf("Thursday");
        break;

        case 5:
        printf("Friday");
        break;

        case 6:
        printf("Saturday");
        break;

        case 7:
        printf("Sunday");
        break;

      }

   }  

   else {
    printf("That's not a day dude...");
   }
   
    return 0;
    
}