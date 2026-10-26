package array;

public class Practice1 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	System.out.println("frist half");
	for(int i=0;i<a.length/2;i++)
		System.out.println(a[i]);
	System.out.println("last half");
	for(int i=a.length/2;i<a.length;i++)
		System.out.println(a[i]);
	System.out.println("reverse order");
	System.out.println("first half");
	for(int i=a.length-1;i>=a.length/2;i--)
		System.out.println(a[i]);
	System.out.println("last half");
	for(int i=a.length/2-1;i>=0;i--)
		System.out.println(a[i]);
	System.out.println("only even values");
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0)
			System.out.println(a[i]);
	}
	System.out.println("only odd values in reverse order");
	for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0)
			System.out.println(a[i]);
	}
	int b[]= {5,4,7,6,3,2,1};
	System.out.println("even indexed vales");
	for(int i=0;i<b.length;i++) {
		if(i%2==0)
			System.out.println(b[i]);
	}
	System.out.println("print only odd indexed value");
	for(int i=0;i<b.length;i++) {
		if(i%2!=0)
			System.out.println(b[i]);
	}
	System.out.println("calculate the sum of array values");
	int sum=0;
	for(int i=0;i<b.length;i++) {
		sum+=b[i];	
	}
	System.out.println(sum);
	
	System.out.println("sum of only even values");
	 sum=0;
	for(int i=0;i<b.length;i++) {
		if(b[i]%2==0)
		sum+=b[i];	
	}
	System.out.println(sum);
	System.out.println("product of only odd values");
	 int prod=1;
	for(int i=0;i<b.length;i++) {
		if(b[i]%2==0)
		prod*=b[i];	
	}
	System.out.println(prod);
	System.out.println("count the element in the array");
	int count1=0,count=0;
	for(int i=0;i<b.length;i++) {
		if(b[i]%2==0)
			count++;
		else
			count1++;
	}
	System.out.println("no. of even values in array"+count);
	System.out.println("no. of odd values in array"+count1);
}
}
