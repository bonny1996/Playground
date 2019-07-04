#include <stdio.h>
int main() {
	//Type your code
  int n,c;
  scanf("%d",&n);
  for(c=1;c<=2*n;c++)
  {
    if(c%2==1)
    {
  printf("%d\n",c);
  }
  }
	return 0;
}