#include <stdio.h>
int main() 
{
	//Type your code
  int n,r,sum=0;
  scanf("%d",&n);
  while(n>0)
  {
    r=n%10;
    sum=sum+r;
    n=n/10;  
  }
  printf("%d",sum);
	return 0;
}