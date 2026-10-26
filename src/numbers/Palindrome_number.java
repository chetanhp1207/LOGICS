package numbers;

public class Palindrome_number {
public static void main(String[] args) {
	int n=12321,res=0,temp=n;
	while(n!=0) {
		int rem=n%10;
		res=(res*10)+rem;
		n/=10;
	}
	if(res==temp)
		System.out.println("palindrome");
	else
		System.out.println("not a palindrome");
	
}
}

