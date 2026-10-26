package practice2;
public class Pal13 {
	public static void main(String[] args) {
		String s="wow madam racecar level";
		String[] x=s.split(" ");
		int m=s.length();
		String s1="";
		for(int i=0;i<x.length;i++) {
			if(ispal(x[i])) {
				if(x[i].length()<=m) {
					s1=x[i];
					m=s1.length();
				}
			}
		}
		System.out.println(s1);
		
	}
	
	static boolean ispal(String s) {
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			if(ch[i]==ch[j]) {
				i++;
				j--;
			}
			else
				return false;
		}
		return true;
	}
}

