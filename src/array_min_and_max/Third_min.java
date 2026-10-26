package array_min_and_max;

public class Third_min {
	public static void main(String[] args) {
		int a[]= {5,8,-8,4,11,-9,-6,1};
		int fmin=a[0],smin=a[0],tmin=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]<fmin) {
				tmin=smin;
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin){
				tmin=smin;
				smin=a[i];
			}
			else if(a[i]<tmin)
				tmin=a[i];
		}
		System.out.println("third minimum is "+tmin);
	}
}
