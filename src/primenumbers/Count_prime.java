package primenumbers;

public class Count_prime {
	public static void main(String[] args) {
		int a[]= {1,2,4,5,7,8,11,3};
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(isprime(a[i]))
				c++;
		}
		System.out.println("no. of prime numbers in array: "+c);
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
