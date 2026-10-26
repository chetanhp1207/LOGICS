package array;

public class Search6 {
public static void main(String[] args) {
	int[] a= {3,1,2,1,5,7,1,9};
	int n=1;
	if(count(a,n)>0)
		System.out.println("total count of the element :"+count(a,n));
	else
		System.out.println("element not found");
}
static int count(int a[],int n) {
	int c=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==n) {
			c++;
		}
	}
	return c;
}
}
