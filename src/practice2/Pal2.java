package practice2;

public class Pal2 {
public static void main(String[] args) {
	String s="levl";
	if(s.equals(reverse(s)))
		System.out.println(" palindrome");
	else
		System.out.println("not palindrome");
		
					
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
	return(new String(ch));
}
}
