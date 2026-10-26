package array;

import java.util.Arrays;

public class Sort3 {
	public static void main(String[] args) {
		int a[]= {3,6,8};
		int b[]= {2,9,1};
		int c[]= {7,4,5};
		int d[]=new int[a.length+b.length+c.length];
		System.arraycopy(a, 0, d, 0, a.length);
		System.arraycopy(b, 0, d, a.length, b.length);
		System.arraycopy(c, 0, d, a.length+b.length, c.length);
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
	}
}
