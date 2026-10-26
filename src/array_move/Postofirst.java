package array_move;

import java.util.Arrays;

public class Postofirst {
public static void main(String[] args) {
	int[] a= {0,-1,3,-4,8,0,6,7,-6};
	int i=0,j=a.length-1;
	while(i<j) {
		if(a[i]<0) {
			i++;
		}
		else if(a[j]>=0)
			j--;
		else {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}
	}
	System.out.println(Arrays.toString(a));
}
}
