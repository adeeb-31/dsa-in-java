import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a no.");
        int n=s.nextInt();
        int r,rev=0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
            
            
        }
        System.out.println(rev);

    }
}