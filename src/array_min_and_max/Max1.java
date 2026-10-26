package array_min_and_max;

import java.util.Arrays;

public class Max1 {
public static void main(String[] args) {
	int[] a= {7,9,3,1,5,-8,6,4};
	Arrays.sort(a);
	System.out.println("first max: "+a[a.length-1]);
	System.out.println("second max: "+a[a.length-2]);
	System.out.println("third max: "+a[a.length-3]);
}
}
