package assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<=13;i++)
		{
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			
		}
		// TODO Auto-generated method stub

	}

}
