#include<stdio.h>
int main()
{
  //Type your code here
  int arry,m=0,k=-1;
  scanf("%d",&arry);
  int a[arry];
  for(int i=0;i<arry;i++)
  {
    scanf("%d",&a[i]);
  }
  int x,y;
  scanf("%d%d",&x,&y);
  for(int j=0;j<arry;j++)
  {
    if(a[j]==x)
    {
      printf("%d\n",j);
    }
       if(a[j]==y)
    {
    printf("%d\n",j);
      k=1;
    }
  }

  
    if((k==1))
       {
         
       }
  else
    printf("%d",k);
  
  return 0;
}