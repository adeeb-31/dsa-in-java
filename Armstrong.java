import java.util.*;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int r,sum=0;
        int m=n;
        
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        System.out.println(sum);
        if (m==sum) {
            System.out.println("Is a Armstrong number");
            
        }
        else{
            System.out.println("Not a Armstrong number");
        }
    }
}