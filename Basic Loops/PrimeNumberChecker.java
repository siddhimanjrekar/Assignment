import java.util.Scanner;
public class PrimeNumberChecker{
	public static void main (String args[]){
		System.out.println("Enter a number n: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count=0;
		for(int i=1; i<=number; i++){
			if(number%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("The number is prime");
		}
		else{
			System.out.println("The number is not prime");
		}
	}
}

/*
Enter a number n: 
11
The number is prime
*/