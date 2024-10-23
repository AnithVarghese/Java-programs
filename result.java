package evenodd;

public class result {
	public static void main(String args[])
	{   int p=45,c=52,m=47,o=62;
	    if(p>=35 && c>=35 && m>=35 && o>=35 ) {
        int total=p+c+m+o;
        System.out.println("Total Marks: "+total);
	    float percentagef=(total/400f)*100;
	    System.out.println("Percentage: "+percentagef);
	    if(percentagef>=35 && percentagef <60) {
	    System.out.println("Second Class");
	    }
	    if(percentagef >= 60 && percentagef < 80) {
	    	System.out.println("First class");
	    }
	    if(percentagef >= 80) {
	    System.out.println("Distinction");
	    }
	    }
	    else
	    {
		System.out.println("FAIL ");
	    }
	}

}
