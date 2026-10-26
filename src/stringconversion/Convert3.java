package stringconversion;

public class Convert3 {
	public static void main(String[] args) {
		String s="hello";
		char f=(char)(s.charAt(0)-32);
		char l=(char)(s.charAt(s.length()-1)-32);
		System.out.println(f+rev(s.substring(1,s.length()-1))+l);
		
	}
	static String rev(String s) {
		char ch[]=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			char t=ch[i];
			ch[i]=ch[j];
			ch[j]=t;
			i++;j--;
		}
		return(new String(ch));
	}
}
