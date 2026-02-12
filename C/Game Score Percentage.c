#include <stdio.h>
int main()
{
  int maxScore=500;
  int userScore=423;
float percentage=(float) userScore/maxScore * 100;
printf("User Score Percentage is:%.2f",percentage);
return 0;
}