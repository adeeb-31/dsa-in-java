import java.util.*;
public class Deleting_array {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int A[]=new int[10];

        A[0]=1;  A[1]=2;  A[2]=3; A[3]=10;  A[4]=20; A[5]=44;
    
        int n=6;

        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
            
        }
        System.out.println("");
    
        System.out.println("enter index which you want to delete");

        int index=sc.nextInt();

        for(int i=index;i<n-1;i++){
            A[i]=A[i+1];
           
        }
        n--; // reducing number of elements
        
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
            
        }
        System.out.println("");  

    }
    
    
}
