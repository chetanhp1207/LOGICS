package substring;

public class swap2 {

			void rev(String s)
			{
				char[] ch=s.toCharArray();
				int i=0,j=ch.length-1;
				while(i<j)
				{
					if(ch[i]!=ch[j])
				{
					System.out.println("not a palindrom");
					return;
				}
				    i++;j--;
				    {

					System.out.println("palindrom");
			}
	}
			}

			public static void main(String[] args) 
			{
				swap2 r1=new swap2 ();
				r1.rev("amma");
		}
	}

