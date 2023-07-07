import java.util.Scanner;
public class FibonacciSeries{
  public static void main(String[] args) {
    int n , first = 0, second = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    n = sc.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");
    for (int i = 1; i <= n; ++i) {
      System.out.println(first);    
      int Temp = first + second;
      first = second;
      second = Temp;
    }
  }
}