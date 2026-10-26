package Practice;

public class Alt {
	public static void main(String[] args) {
		String s="java is my favourite language";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(i%2==0)
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