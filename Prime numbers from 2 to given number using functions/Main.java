#include<stdio.h>
int fun(int m)
{
  int x=1;
  for(int i=2;i<=m/2;i++)
  {
    if (m%i==0)
      {
      x=0;
        break;
    }
  }
  return x;
}
int main()
{
    // Type your code here
  int n,a;
  scanf("%d",&n);
  
  for(int j=2;j<=n;j++)
  {
    a=fun(j);
    if (a!=0)
    {
      printf("%d\n",j);
    }
  }
    return 0;
}