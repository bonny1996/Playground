#include <stdio.h>
int main() {
    // Type your code here 
  int n;
  scanf("%d",&n);
  int x=n;
  for(int i=1;i<=n;i++)
  {
    for(int j=x;j>=1;j--)
    {
      printf("%d",j);
    } x--;
    printf("\n");
  }
	return 0;
}