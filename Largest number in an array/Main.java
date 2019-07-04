#include<stdio.h>
int main()
{
  //fill the code
  int arry,m=0;
  scanf("%d",&arry);
  int a[arry];
  for(int i=0;i<arry;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int j=0;j<arry;j++)
  {
    if(a[j]>m)
    {
      m=a[j];
    }
    
  }
  printf("%d",m);
  return 0;
}