package numbers;

public class Binary_to_integer {
public static void main(String[] args) {
	String n="1101";
	int res=0;
	for(int i=0;i<n.length();i++) {
		 res=(res*2)+(n.charAt(i)-'0');
		
	}
	System.out.println(res);
}
}
