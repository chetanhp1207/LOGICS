package stringconversion;

public class Convert {
	public static void main(String[] args) {
		String s="hello";
		char f=(char)(s.charAt(0)-32);
		System.out.println(f+s.substring(1));
		
	}
}
