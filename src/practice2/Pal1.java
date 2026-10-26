package practice2;

public class Pal1 {
public static void main(String[] args) {
	String s="madam";
	String res="";
	char[] ch=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		res+=ch[i];
	}
	if(s.equals(res))
		System.out.println("string is palindrome");
	else
		System.out.println("string is not a palindrome");
		
}
}
