package Practice;
public class RE {
public static void main(String[] args) {
	String s="java is the number one language in the world";
	String[] s1=s.split(" ");
	for(int i=0;i<s1.length;i++) {
		if(s1[i].length()%2==0)
			System.out.print(reverse(s1[i]));
		else
			System.out.print((s1[i]));
		System.out.print(" ");
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

