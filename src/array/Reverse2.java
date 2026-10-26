package array;

import java.util.Arrays;

public class Reverse2 {
public static void main(String[] args) {
	int[] a= {4,7,2,1,3,5};
	int temp[]=new int[a.length];
	int j=0;
	for (int i = a.length-1; i >=0; i--) {
		temp[j++]=a[i];
	}
	System.out.println(Arrays.toString(temp));
}
}
