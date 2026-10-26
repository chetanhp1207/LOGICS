package numbers;

public class Disarium_number {
public static void main(String[] args) {
	int n=89,temp=n,sum=0,count=0;
	while(n!=0) {
		count++;
		n/=10;
	}
	n=temp;
	while(temp!=0) {
		int res=temp%10;
		sum+=Math.pow(res, count--);
		temp/=10;
	}
	if(n==sum)
		System.out.println("Disarium number");
	else
		System.out.println("not disarium number");

}
}
