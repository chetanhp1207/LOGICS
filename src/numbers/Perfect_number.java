package numbers;

public class Perfect_number {
public static void main(String[] args) {
	int n=28,sum=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0)
			sum+=i;
	}
	if(n==sum)
		System.out.println("perfect number");
	else
		System.out.println("not a perfect number");
}
}
