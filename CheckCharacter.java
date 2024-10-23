package evenodd;

public class CheckCharacter {
	public static void main(String args[]) {
		char ch='8';
		{
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			{
				System.out.println(ch+ " : ALPHABET");
			}
			else if(ch>='0' && ch<='9')
			{
				System.out.println(ch+" : NUMERIC");
			}
			else
			{
				System.out.println(ch+" : SPECIAL CHARACTER");	
			}
		}
		
	}

}
