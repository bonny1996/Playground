#include <stdio.h>
int main() {
	//Type your code
  int n,temp,sum=0,rem,fact=1,i;
  scanf("%d",&n);
  temp=n;
  while(temp>0)
  {
    rem=temp%10;
    fact=1;
    for(i=1;i<=rem;i++)
    {
      fact=fact*i;
      //printf("%d\n",fact);
    }
    
    sum=sum+fact;
    temp=temp/10;
  }
  //printf("%d",sum);
  if(n==sum)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}