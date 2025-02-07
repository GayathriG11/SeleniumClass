package assignment;

public class Palindrome {

	public static void main(String[] args) {
		int input=1441;
		int output=0;
		int rem;
		for(int i=input;i>0;i=i/10)
		{
			rem=i%10;
			output=(output*10)+rem;
			System.out.println("output"+output);
			
		}
		{
			if(input==output)
				System.out.println("number is palindrome");
			else
				System.out.println("number not a palindrome");
		}
		}
		// TODO Auto-generated method stub

	}


