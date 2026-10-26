package logicsclass;

public class Prime {
public static void main(String[] args) {
	int n=18,c=0;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			c++;
		}
	}
	if(c==0)
		System.out.println("prime number");
	else
		System.out.println("not a prime number");
}
}
