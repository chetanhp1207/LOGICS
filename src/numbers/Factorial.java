package numbers;

public class Factorial {
public static void main(String[] args) {
	int n=7,fact=1;
	for(int i=n;i>=1;i--) {
		fact*=i;
	}
	System.out.println("factorial of "+n+" is: "+fact);
}
}
