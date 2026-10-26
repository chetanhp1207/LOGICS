package stringconversion;

public class Most {
	public static void main(String[] args) {
		String s="aaabbbbvvsssdddd";
		int[] a=new int[128];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			a[ch]++;
		}
		int n=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				if(a[i]>=n) {
					n=a[i];
				}
			}
		}
		System.out.println("most repeted charecter:");
		for(int i=0;i<a.length;i++) {
			if(a[i]==n)
				System.out.println((char)i+" "+a[i]);
		}
	}
}
