package stringconversion;

public class UtoL {
public static void main(String[] args) {
	String s="hIhELLObYE";
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>='a'&&ch[i]<='z') {
			ch[i]=(char)((ch[i]-32));
		}
		else {
			ch[i]=(char)(ch[i]+32);
		}
	}
	System.out.println(new String(ch));
}
}

