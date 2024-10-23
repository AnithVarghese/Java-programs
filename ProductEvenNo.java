package evenodd;

 class ProductEvenNo {
	public static void main(String[] args) {
		int prod=1, n=10;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0) {
				prod*=i;
			}
			
		}
		System.out.println("The product of even numbers from 1-10 : "+prod);
	}

}
