package array_min_and_max;

public class Max {
public static void main(String[] args) {
	int a[]= {5,34,2,11,9,6,-2,5};
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(max<a[i])
			max=a[i];
	}
	System.out.println("maximum is: "+max);
}
}
