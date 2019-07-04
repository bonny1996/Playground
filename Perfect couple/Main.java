#include<stdio.h>
#include<stdlib.h>
void check(int a[], int n, int sum);
int main()
{
    // Get the size of an array
    int n;
    scanf("%d", &n);
    
    // Get the array elements
    int a[50], i;
    for(i=0; i<n; i++)
    {
        scanf("%d", &a[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check(a, n, sum);
    return 0;
}

void check(int a[], int n, int sum)
{
  // Type your code here
  for(int i=0;i<n-1;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(sum==(a[i]+a[j]))
      {
      printf("Perfect couple: %d %d",a[i],a[j]);
      exit(0);
    }
  }
}
printf("No perfect couple found!");
}