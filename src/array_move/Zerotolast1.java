package array_move;

import java.util.Arrays;

public class Zerotolast1 {
public static void main(String[] args) {
	int a[]= {0,3,0,2,1,8,5};
	int i=0,j=a.length-1;
	while(i<j) {
		if(a[i]!=0)
			i++;
		else if(a[j]==0)
			j--;
		else {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	System.out.println(Arrays.toString(a));
}
}
