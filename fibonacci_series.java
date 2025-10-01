import java.util.Scanner;
public class fibonacci_series {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no. of terms  u want to print the series");
      int n=sc.nextInt();

      int a=0;int b=1;
       System.out.println("Fibonacci series: ");
      for(int i=1;i<=n;i++){       
         System.out.print(a + " ");
        int c=a+b;
        a=b;
        b=c;
      }
  }  
}
