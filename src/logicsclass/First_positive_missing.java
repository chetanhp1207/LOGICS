package logicsclass;

public class First_positive_missing {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,7};
	int n=a[a.length-1];
	int res=n*(n+1)/2;
	int sum=0;
	for(int x:a)
		sum+=x;
	System.out.println("missing number is: "+(res-sum));
}
}
