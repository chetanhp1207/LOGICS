package array;

import java.util.Arrays;

public class Rotate {
public static void main(String[] args) {
	int a[]= {1,3,2,6,8};
	int k=1;
	k=k%a.length;
	for (int i = 0; i < k; i++) {
		int first=a[0];
		for (int j = 0; j < a.length-1; j++) {
			a[j]=a[j+1];
		}
		a[a.length-1]=first;
	}
	System.out.println(Arrays.toString(a));
}
}
