package array;

import java.util.Arrays;

public class Right_rotate {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int k=2;
	k=k%a.length;
	for (int i = 0; i < k; i++) {
		int first=a[a.length-1];
		for (int j = a.length-1; j > 0; j--) {
			a[j]=a[j-1];
		}
		a[0]=first;
	}
	System.out.println(Arrays.toString(a));
}
}
