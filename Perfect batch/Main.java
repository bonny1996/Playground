/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
void fun(int a[],int x)
{
  int sum1=0,sum2=0;
  for(int i=0;i<x/2;i++)
  {
    sum1=sum1+a[i];
  }
  for(int j=x/2;j<x;j++)
  {
    sum2=sum2+a[j];
  }
  if(sum1==sum2)
  {
    printf("Perfect Batch");
  }
  else
  {
    printf("Not a Perfect Batch");
  }
}
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

  fun(a,n);
  return 0;
}