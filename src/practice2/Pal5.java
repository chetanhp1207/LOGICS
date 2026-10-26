package practice2;

public class Pal5 {
	public static void main(String[] args) {
		String s="Never Odd or Even";
		if(s.equalsIgnoreCase(reverse(s)))
			System.out.println(" palindrome");
		else
			System.out.println("not palindrome");
			
						
	}
	static String reverse(String s) {
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			if(ch[i]==' ')
				i++;
			else if(ch[j]==' ')
				j--;
			else {
			char t=ch[i];
			ch[i]=ch[j];
			ch[j]=t;
			i++;j--;
			}
		}
		return(new String(ch));

}
}
