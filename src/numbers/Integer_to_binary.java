package numbers;

public class Integer_to_binary {
public static void main(String[] args) {
	int n=12;
	String res="";
	while(n!=0) {
		int rem=n%2;
		res=rem+res;
		n/=2;
	}
	System.out.println(res);
}
}
