package stringconversion;

public class Freq2 {
	public static void main(String[] args) {
		String s="race";
		String s1="acre";
		int[] a=new int[128];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			a[ch]++;
		}
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			a[ch]--;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				System.out.println("not anagram");
				return;
			}
		}
		System.out.println("anagram");

	}

}
