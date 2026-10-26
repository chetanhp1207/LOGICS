package sort;

import java.util.Arrays;

public class Bubble {
public static void main(String[] args) {
	int a[]= {2,7,8,1,3,4,0};
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length;i++) {
		for (int j = 0; j < a.length-1-i; j++) {
			if (a[j]>a[j+1]) {
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
}
