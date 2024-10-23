package evenodd;

public class Dmartbill {
	public static void main(String[] args)
	{
		int p1=799,p2=1299,p3=299,p4=599;
	    int total=p1+p2+p3+p4;
	    float discount=(25/100.0f)*total;
		float finalprice=total-discount;
		System.out.println("PRICE: "+total);
		System.out.println("DISCOUNT: "+discount);
		System.out.println("FINAL PRICE: "+finalprice);
	}

}
