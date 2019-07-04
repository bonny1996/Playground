#include<stdio.h>
int power(int n,int p)
{
  int mult=1;
  for(int i=1;i<=p;i++)
  {
    mult=mult*n;
  }
   printf("%d",mult); 
}
int main()
{
    // Type your code here
  int n,p;
  scanf("%d%d",&n,&p);
  power(n,p);
  	return 0;
}