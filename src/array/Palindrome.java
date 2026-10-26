package array;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	checkprime(n);
	sc.close();
}
public static void checkprime(int n) {
	boolean flag=true;
	if(n<=1) {
		flag=false;
	}
	else {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
	}
	if(flag)
		System.out.println("Prime number");
	else
		System.out.println("not a prime number");
}
}
