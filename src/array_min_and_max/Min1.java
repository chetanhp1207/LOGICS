package array_min_and_max;

import java.util.Arrays;

public class Min1 {
	public static void main(String[] args) {
		int[] a= {7,9,3,1,5,-8,6,4};
		Arrays.sort(a);
		System.out.println("first min: "+a[0]);
		System.out.println("second min: "+a[1]);
		System.out.println("third min: "+a[2]);
	}

}
