#include<stdio.h>
int sum(int m)
{
  int i=1,x;
  while(i<=m)
  {
    x=x+i;
    i++;
  }
  return x;
}
int main() 
{
    // Type your code here
  int n,op;
  scanf("%d",&n);
  op=sum(n);
  printf("%d",op);
  	return 0;
}