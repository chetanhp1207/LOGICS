package practice2;

public class Pal4 {
	public static void main(String[] args) {
		String s="nurses run";
		if(s.equals(reverse(s)))
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
