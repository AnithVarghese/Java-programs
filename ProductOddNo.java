package evenodd;

public class ProductOddNo {
	public static void main(String[] args) {
		long prod=1;int n=100;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0) {
				prod*=i;
			}
			
		}
		System.out.println("The product of odd numbers from 1-100 : "+prod);
	}

}
