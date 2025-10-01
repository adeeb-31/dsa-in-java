import java.util.Scanner;
public class GCD {

    static int gcd(int x,int y){
        while(x!=y){
            if(x>y){
                x=x-y;
            }
            else{
                 y=y-x;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no.s whos gcd u want");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(gcd(x,y));
    }
    
}
