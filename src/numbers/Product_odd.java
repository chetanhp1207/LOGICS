package numbers;

public class Product_odd {
	public static void main(String[] args) {
		int n=12345;
		int prod=1;
		while(n!=0) {
			int r=n%10;
			if(r%2!=0)
			prod*=r;
			n=n/10;
		}
		System.out.println("product of odd digits: "+prod);
	}
}
