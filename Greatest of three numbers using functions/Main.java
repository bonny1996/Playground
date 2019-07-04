#include <stdio.h>
int comp(int n,int m)
{
  if(n<m)
  {
    return m;
  }
  else
  {
    return n;
  }
}
int main()
{
	// Type your code here
  int a,b,c,d,e;
  scanf("%d%d%d",&a,&b,&c);
  d=comp(a,b);
    e=comp(d,c);
  printf("%d",e);
  	return 0;
}