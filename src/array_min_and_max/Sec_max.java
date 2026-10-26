package array_min_and_max;

public class Sec_max {
	public static void main(String[] args) {
		int a[]= {5,9,-8,4,11,-9,4,33};
		int fmax=a[0],smax=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax)
				smax=a[i];

		}
		System.out.println("second max is "+smax);
	}

}
