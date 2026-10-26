package logicsclass;

public class Lc {
	public static void main(String[] args) {
		String s="AbZCyiIptewkl";
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			if(isalp(ch[i]))
				i++;
			else if(isalp(ch[j]))
				j--;
			else {
				char t=ch[i];
				ch[i]=ch[j];
				ch[j]=t;
				i++;j--;
			}
			
		}
		System.out.println(new String(ch));
	}
	static boolean isalp(char ch) {
		return(ch>='A'&&ch<='Z');
		
	}

}
