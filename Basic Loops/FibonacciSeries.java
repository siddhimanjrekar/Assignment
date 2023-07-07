import java.util.Scanner;
public class FibonacciSeries{
  public static void main(String[] args) {
    int n , first = 0, second = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number n: ");
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

/*
Enter number n: 
10
Fibonacci Series till 10 terms:
0
1
1
2
3
5
8
13
21
34
*/