package substring;

public class swap1 {
		static String rev()
		{
			String s="anna";
			char[] ch=s.toCharArray();
			int i=0,j=ch.length-1;
			while(i<j)
			{
				if(ch[i]!=ch[j])
			{
				return("not a palindrom");
			
			}
			    i++;j--;
			}

				return("palindrom");
				
		}

		public static void main(String[] args) 
		{
			
			System.out.println(rev());
		}
	}

