package stringconversion;

public class Freq {
public static void main(String[] args) {
	String s="aabbcccdd";
	int[] a=new int[128];
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		a[ch]++;
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			System.out.println((char)i+" "+a[i]);
		}
	}
}
}
