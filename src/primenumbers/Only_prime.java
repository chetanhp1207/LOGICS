package primenumbers;

public class Only_prime {
public static void main(String[] args) {
	int a[]= {1,2,4,5,7,8,11,3};
	for (int i = 0; i < a.length; i++) {
		if(isprime(a[i]))
			System.out.println(a[i]);
	}
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
