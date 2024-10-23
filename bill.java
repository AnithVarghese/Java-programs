package evenodd;

public class bill {
	public static void main(String[] args)
	{
		int price=135,qty=6;
	    int total=price*qty;
		float gst=total*(18/100f);
		float grandtotal=total+gst;
		System.out.println("TOTAL: "+total);
		System.out.println("GST: "+gst);
		System.out.println("GRANDTOTAL: "+grandtotal);
	}

}
