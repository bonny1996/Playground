#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int j=0;j<=n-2;j++)
  {
    for(int j1=j+1;j1<=n-1;j1++)
    {
    for(int j2=j1+1;j2<=n-1;j2++)
    {
      printf("(%d, %d, %d) ",a[j],a[j1],a[j2]);
    }
    }
    printf("\n");
  }
  
  return 0;
}