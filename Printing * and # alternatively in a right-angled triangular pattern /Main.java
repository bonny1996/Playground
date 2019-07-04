#include <stdio.h>
int main(){
	// Type your code here
  int n,i,j,k=0;
  scanf("%d",&n);
  for( i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      k=k+1;
        if (k%2==1)
        {
      printf("*");
        }
      else
      {
        printf("#");
      }
    }
    printf("\n");
  }
  	return 0;
}