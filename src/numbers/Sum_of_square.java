package numbers;
//finding sum of sqaure of each digit till you get single digit
public class Sum_of_square {
public static void main(String[] args) {
	int n=98;
	while(n>9) {
		n=square(n);
	}
	System.out.println(n);
}
static int square(int n) {
	int sum=0;
	while(n!=0) {
		int res=n%10;
		sum+=res*res;
		n/=10;
	}
	return sum;
}
}
