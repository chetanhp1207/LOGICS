package array;

import java.util.Arrays;

//reverse array without using temporary variable
public class Reverse1 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	System.out.println(Arrays.toString(a));
	int i=0,j=a.length-1;
	while(i<j) {
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
		i++;j--;
	}
	System.out.println(Arrays.toString(a));
}
}
