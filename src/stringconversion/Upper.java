package stringconversion;

public class Upper {
public static void main(String[] args) {
	String s="AbvcsdDGHTrsIy";
	System.out.println("upper case to lower conversion");
	System.out.println(lower(s));
	System.out.println("lowercase to uppercase conversion");
	System.out.println(upper(s));
}
static String lower(String s) {
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int x=ch[i];
		if(x>=65&&x<=90) {
			ch[i]=(char) (x+32);
			
		}
	}
	return (new String(ch));
}
static String upper(String s) {
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int x=ch[i];
		if(x>=90&&x<=122) {
			ch[i]=(char) (x-32);
			
		}
	}
	return (new String(ch));
}
}
