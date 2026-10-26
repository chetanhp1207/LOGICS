package numbers;

public class GCD {
public static void main(String[] args) {
	int a=48,b=47;
	while(b!=0) {
		int res=b;
		b=a%b;
		a=res;	
	}
	System.out.println(a);
}
}
