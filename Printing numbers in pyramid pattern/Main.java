#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int x=1;
  for(int i=1;i<=n;i++)
  {
    for(int s=1;s<=n-i;s++)
    {
      printf(" ");
    }
      for(int j=1;j<=i;j++)
      {
        printf("%d ",x);
        x++;
      }
      printf("\n");
  }
	return 0;
}