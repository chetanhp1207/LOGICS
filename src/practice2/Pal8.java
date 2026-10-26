package practice2;

public class Pal8 {
	public static void main(String[] args) {
		String s="java level madam code";
		String[] x=s.split(" ");
		for(int i=0;i<x.length;i++) {
			if(ispal(x[i])) {
				System.out.print(x[i]+" ");
			}
		}
		
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
