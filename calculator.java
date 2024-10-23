package evenodd;

public class calculator {
	public static void main(String[] args) {
		
	char operation='*';
	int a=10,b=30;
	switch(operation) {
	case '+':
		int sum=a+b;
		System.out.println(sum);
		 break;
	case '-':
		int difference=a-b;
		System.out.println(difference);
		break;
	case '/':
		double div=(double)a/b;
		System.out.println(div);
		break;
	case '*':
		float mul=a*b;
		System.out.println(mul);
		break;
	default:
		System.out.println("INVALID OPERATION");
		break;
	}

}
}
