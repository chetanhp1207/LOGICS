package numbers;

public class Armstrong_number {
public static void main(String[] args) {
	int n=153,temp=n,sum=0,count=0;
	while(n!=0) {
		count++;
		n/=10;
	}
	n=temp;
	while(temp!=0) {
		int res=temp%10;
		sum+=Math.pow(res, count);
		temp/=10;
	}
	if(n==sum)
		System.out.println("armstrong number");
	else
		System.out.println("Not armstrong number");
}
}
