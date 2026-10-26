package Practice;

public class Rec {
public static void main(String[] args) {
	String s="hello";
	System.out.println(reve(s));
	
}
static String reve(String s) {
	char[] ch=s.toCharArray();
	String res="";
	for(int i=ch.length-1;i>=0;i--){
		res=reve(s.substring(1))+ch[0];
	}
	return res;
}
}
