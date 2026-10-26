package numbers;

public class Count {
	public static void main(String[] args) {
		int n=123456;
		int odd=0,even=0;
		while(n!=0) {
			int r=n%10;
			if(r%2!=0)
			odd++;
			else
				even++;
			n=n/10;
		}
		System.out.println("no.  of odd digits: "+odd);
		System.out.println("no. of even digits: "+even);
	}
}
