package evenodd;

public class oddsum {
	public static void main(String[] args)
	{
		 int sum=0;int n=100;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0) {
				sum+=i;
			}
			
		}
		System.out.println("The sum of odd numbers from 1-100 : "+sum);
	}

}
