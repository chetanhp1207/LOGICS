package numbers;

public class Happy_number {
public static void main(String[] args) {
	int n=19;
	while(n>9) {
		n=square(n);
	}
	if(n==1||n==7) {
		System.out.println("happy number");
	}
	else
		System.out.println("Not a happy number");
}
static int square(int n) {
	int sum=0;
	while(n!=0) {
		int res=n%10;
		sum+=res*res;
		n/=10;
	}
	return sum;
}

}
