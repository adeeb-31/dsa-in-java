import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();

        int r,rev=0;
         int m=n;


         while(n>0){

            r=n%10;
            rev=rev*10+r;
            n=n/10;

         }
         if(m==rev){
            System.out.println("is pallindrome");
         }
         else{
            System.out.println("not pallindrome");
         }
    }
}
