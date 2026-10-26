package primenumbers;

public class Largest_prime {
public static void main(String[] args) {
	int a[]= {4,9,8,6,2,3,7,5};
	int l=Integer.MIN_VALUE;
	boolean f=false;
	for(int i=0;i<a.length;i++) {
		if(isprime(a[i])&&(l<a[i])) {
			
				l=a[i];
				f=true;
		}
	}
	if(f)
		System.out.println("largest prime number is: "+l);
	else
		System.out.println("no prime number in array");
}
static boolean isprime(int n) {
	if(n<=1)
		return false;
	else {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
	}
	return true;
}
}
