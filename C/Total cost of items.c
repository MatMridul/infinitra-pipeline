#include <stdio.h>
int main()
{
    int items=50;
    float cost_per_item=9.99;
    float total_cost=items*cost_per_item ;
    char currency='$';

    printf("Number of Items:%d",items);
    printf("\n");
    printf("Cost per Item:%.2f",cost_per_item);
    printf("\n");
    printf("Total Cost of Items:%.2f%c",total_cost,currency);

    return 0 ;     
    }