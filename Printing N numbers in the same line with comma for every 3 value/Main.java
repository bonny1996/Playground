#include <stdio.h>
int main() {
	//Type your code
  int n,i;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    if(i%3==0)
    {
    printf("%d",i);
      printf(",");
    }
    else
      printf("%d",i);
    
  }
	return 0;
}