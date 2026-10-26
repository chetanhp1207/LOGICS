package logicsclass;

public class Palindrome {
public static void main(String[] args) {
	String s="nitin and mam are level racres";
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
