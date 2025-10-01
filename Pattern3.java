import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int n=5;
        if(n%2==0){
            n++;
        }

        for(int i=1;i<=n/2+1;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print("");
            }
            for(int j=0;j<i*2-1;j++){

                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++){
            System.out.println("e");
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++){
            System.out.println("    e");
        }
        for(int i=n;i>=n/2+1;i--){
            // for(int j=n-i-1;j>0;j--){
            //     System.out.print("");
            // }
            for(int j=n-(i/2)+1;j < n;j--){
                System.out.print("*");
            }
            System.out.println();
        }
   }
}
