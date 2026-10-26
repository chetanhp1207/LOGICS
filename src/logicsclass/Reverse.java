package logicsclass;
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	String s;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter the string");
		s=sc.next();
	}
	char ch[]=s.toCharArray();
	int i=0,j=ch.length-1;
	while(i<j) {
		char t=ch[i];
		ch[i]=ch[j];
		ch[j]=t;
		i++;j--;
	
	}
	System.out.println("string after reverse");
	System.out.println(new String(ch));
}
}
