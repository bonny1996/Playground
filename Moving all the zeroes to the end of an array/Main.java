#include<stdio.h>
void check(int n,int a[])
{
 int count=0;
  for(int g=0;g<n;g++)
  {
    if(a[g]>0)
    {
      a[count++]=a[g];
    }
  }
  while(count<n)
  {
    a[count++]=0;
  }
  for(int i=0;i<n;i++)
  {
    printf("%d ",a[i]);
  }
  printf("\n");
  }

int main()
{
 int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  check(n,a);

    
  return 0;
}