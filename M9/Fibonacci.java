//references: https://www.geeksforgeeks.org/different-ways-to-print-fibonacci-series-in-java/
public class Fibonacci {
    public static int Fib(int n)
    {
        if (n < 1 || n == 1){
            System.out.println ("n")
            return n;
        }
        else{
            System.out.println ((n-1) + " " + (n-2));
            return Fib (n-1) + Fib (n-2);
        }
    }
  
    // Driver Code
    public static void main(String args[])
    {
        int n = 20;
        Fibonacci(n);
    }
}