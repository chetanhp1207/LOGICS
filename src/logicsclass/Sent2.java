package logicsclass;

public class Sent2 {
	public static void main(String[] args) {
		String s="hi hello how are you";
		String[] x=s.split(" ");
		for(int i=x.length-1;i>=0;i--) {
			System.out.print(rev(x[i])+" ");
		}
	}
		static String rev(String s) {
			char[] ch=s.toCharArray();
			int i=0,j=ch.length-1;
			while(i<j) {
				char t=ch[i];
				ch[i]=ch[j];
				ch[j]=t;
				i++;j--;
			}
			return new String(ch);
		}	
	}
