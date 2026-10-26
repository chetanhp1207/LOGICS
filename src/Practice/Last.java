package Practice;
public class Last {
public static void main(String[] args) {
	String s="java is easy";
	String s1[]=s.split(" ");
	s1[s1.length-1]=reverse(s1[s1.length-1]);
	for(int i=0;i<s1.length;i++) {
		System.out.print(s1[i]+" ");
	}
	
}
static String reverse(String s) {
	char[] ch=s.toCharArray();
	int i=0,j=ch.length-1;
	while(i<j) {
		char t=ch[i];
		ch[i]=ch[j];
		ch[j]=t;
		i++;j--;
	}
	return (new String(ch));
}
}

