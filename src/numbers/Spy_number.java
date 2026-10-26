package numbers;

public class Spy_number {
public static void main(String[] args) {
	int n=321,sum=0,prod=1;
	while(n!=0) {
		int res=n%10;
		sum+=res;
		prod*=res;
		n/=10;
	}
	if(sum==prod)
		System.out.println("Spy number");
	else
		System.out.println("not a spy number");
}
}
