package Practice;
class Rev3 
{
	public static boolean isAlpha(char ch) 
	{
		return ch>='0' && ch<='9';
	
	}
	public static void main(String[] args)
	{
		String s="a1b2c3";
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j)
		{
			if(isAlpha(ch[i]))
			{
				i++;
			}
			else if(isAlpha(ch[j]))
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
