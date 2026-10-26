package array;

public class Pal {
public static void main(String[] args) {
	int[] a= {1,2,3,2,1};
	int i=0,j=a.length-1;
	while(i<j) {
		if(a[i]==a[j]) {
		i++;j--;
		}
		else {
		System.out.println("not a palindrome");
		return;
		}
	}
	System.out.println("palindrome");
}
}
