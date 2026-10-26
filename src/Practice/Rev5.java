package Practice;
class Rev5
{
	public static boolean isLower(char ch) 
	{
		return ch>='A' && ch<='Z';
	
	}
	public static void main(String[] args)
	{
		String s="JaVaProgRaM";
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j)
		{
			if(isLower(ch[i]))
			{
				i++;
			}
			else if(isLower(ch[j]))
			{
				j--;
			}
			else{
				char t=ch[i];
				ch[i]=ch[j];
				ch[j]=t;
				i++; j--;
			}
		}
			System.out.println(new String(ch));

}
	}
