import java.util.Scanner;
public class FactorialOfNumber{
	public static void main (String args[]){
		System.out.println("Enter a number n: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial = 1;
		for(int i = number; i>0; i--){
			factorial = factorial*i;
		}
		System.out.println("The factorial of a number is: "+factorial);
	}
}

/*
Enter a number n: 
5
The factorial of a number is: 120
*/