//(sum two variables , x and y , using nested FOR Loops. Initial values of x and y are 1. 
//Perform the task till x<=3 and y<=2
//1. Sum of 2 numbers
//2. Search/Find/Observe what are the input variables and output variables
//3. Find datatypes of input and output variables)

#include <stdio.h>
int main() 
{ 
    int x = 1, y = 1, sum; // Declare and
    for (x=1; x<=3; x++ )
    for (y=1; y<=2; y++)
    {
        sum = x + y; // Sum of two variables
        printf("%d\n", sum);
    }
    y=y+1;
    return  0;
}
  
