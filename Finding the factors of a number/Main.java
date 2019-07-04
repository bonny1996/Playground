#include <stdio.h>
int main() {
	//Type your code
  int n,fact;
  scanf("%d",&n);
  for(fact=1;fact<=n;fact++)
  {
    if (n%fact==0)
    {
      printf("%d\n",fact);
    }
  }
	return 0;
}