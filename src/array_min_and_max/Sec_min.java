package array_min_and_max;

public class Sec_min {
	public static void main(String[] args) {
		int a[]= {5,9,-8,4,11,-9,4,33};
		int fmin=a[0],smin=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]<fmin) {
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin)
				smin=a[i];

		}
		System.out.println("second minimum is "+smin);
	}
}
