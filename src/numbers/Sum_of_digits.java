package numbers;

public class Sum_of_digits {
	public static void main(String[] args) {
		int n=123;
		while(n>9) {
			n=sum(n);
		}
		System.out.println(n);
	}
	static int sum(int n) {
		int s=0;
		while(n!=0) {
			int res=n%10;
			s+=res;
			n/=10;
		}
		return s;
	}

}
