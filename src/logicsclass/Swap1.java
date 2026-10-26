package logicsclass;

public class Swap1 {
	public static void main(String[] args) {
		char a='A',b='C';
		swap11(a,b);
	}
	static void swap11(char a,char b) {
		char t=a;
		a=b;
		b=t;
		System.out.println("a:"+a+" "+"b"+b);
	}
}
