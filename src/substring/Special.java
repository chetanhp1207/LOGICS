package substring;

public class Special {
	public static void main(String[] args) {
		String s=")(*&^%$#";
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')||(ch[i]>='0'&&ch[i]<='9')){
				count++;
			}
		}
		if(count==0)
			System.out.println("string has only special chars");
		else
			System.out.println("string has digits and letters");
		

}
}
