package logicsclass;

public class Extract {
public static void main(String[] args) {
	String s="Tomandjerry";
	String s1=s.substring(s.length()/2);
	char[] ch=s1.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			System.out.println(ch[i]);
	}
	}
}
}
