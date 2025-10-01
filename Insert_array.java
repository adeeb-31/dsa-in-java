import java.util.Scanner;
public class Insert_array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array");

        int n=sc.nextInt();

        int a[]=new int[n];

        

        for(int i=0;i<a.length;i++){

            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+",");
        }
          
    }
    
}
