package Practice;
class Rev4
{
	public static boolean isUpper(char ch) 
	{
		return ch>='a' && ch<='z';
	
	}
	public static void main(String[] args)
	{
		String s="JaVaProgRaM";
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j)
		{
			if(isUpper(ch[i]))
			{
				i++;
			}
			else if(isUpper(ch[j]))
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