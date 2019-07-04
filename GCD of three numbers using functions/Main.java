#include <stdio.h>
int gcd(int n,int m)
{
  int x,y;
  if(n<m)
  {
    x=n;
  }
  else
  {
    x=m;
  }
  while(x>=1)
  {
    if((n%x==0)&&(m%x==0))
    {
      y=x;
      break;
    }x--;
  }return y;
}
int main() 
{
	//Type your code here
  int a,b,c,d,e;
  scanf("%d%d%d",&a,&b,&c);
  d=gcd(a,b);
  e=gcd(d,c);
  printf("%d",e);
	return 0;
}