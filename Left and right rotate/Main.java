// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
void rotate(int a[],int n,int q)
{
  int odd,even,oddn,evenn;
  oddn =(n%2==0)? n-2:n-1;
  evenn=(n%2==0)? n-1:n-2;
  for(int l=0;l<q;l++)
  {
    odd=a[oddn];
    for(int u=oddn;u>=0;u=u-2)
    {
      a[u]=a[u-2];
    }
    a[0]=odd;
    even=a[1];
    for(int g=1;g<n;g=g+2)
    {
      a[g]=a[g+2];
    }
    a[evenn]=even;
  }
  for(int c=0;c<n;c++)
  {
  printf("%d ",a[c]);
  }
}
// Main function
int main()
{
int n,q;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&q);
  rotate(a,n,q);
  
   return 0;
}