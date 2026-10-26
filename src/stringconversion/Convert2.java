package stringconversion;

public class Convert2 {
public static void main(String[] args) {
	String s="hello";
	char f=(char)(s.charAt(0)-32);
	char l=(char)(s.charAt(s.length()-1)-32);
	System.out.println(f+s.substring(1,s.length()-1)+l);
}
}
