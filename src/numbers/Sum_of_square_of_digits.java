package numbers;

public class Sum_of_square_of_digits {
public static void main(String[] args) {
	int n=123,sum=0;
	while(n!=0) {
		int res=n%10;
		sum+=res*res;
		n/=10;
	}
	System.out.println("sum of suare of digits is: "+sum);
}
}
