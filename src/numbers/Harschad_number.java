package numbers;

public class Harschad_number {
public static void main(String[] args) {
	int n=12,sum=0,temp=n;
	while(n!=0) {
		int r=n%10;
		sum+=r;
		n/=10;
	}
	if(temp%sum==0)
		System.out.println("Harschad number");
	else
		System.out.println("not harschad number");
}
}
