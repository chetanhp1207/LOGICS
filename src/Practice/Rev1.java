package Practice;
class Rev1 
{
	public static boolean isVowel(char ch) 
	{
		return ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'|| ch=='O'||ch=='U';
	
	}
	public static void main(String[] args)
	{
		String s="hello";
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j)
		{
			if(isVowel(ch[i]))
			{
				i++;
			}
			else if(isVowel(ch[j]))
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
