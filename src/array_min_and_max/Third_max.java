package array_min_and_max;

public class Third_max {
	public static void main(String[] args) {
		int a[]= {5,9,-8,4,11,-9,4,33};
		int fmax=a[0],smax=a[0],tmax=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]>fmax) {
				tmax=smax;
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax) {
				tmax=smax;
				smax=a[i];
			}
			else if(a[i]>tmax)
				tmax=a[i];
		}
		System.out.println("third max is "+tmax);
	}

}
