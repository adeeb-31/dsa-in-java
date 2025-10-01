import java.util.*;
public class Deleting_array {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of array");
        int size=sc.nextInt();

        int A[]=new int[size];

        System.out.println("enter elements of array");

        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
         for(int i=0;i<A.length;i++){
        System.out.print(A[i]+",");
        }
        System.out.println();
        System.out.println("enter index which you want to delete");
        int index=sc.nextInt();
        for(int i=index;i<size-1;i++){
            A[i]=A[i+1];      
        }
        size--; // reducing number of elements   
        for(int i=0;i<size;i++){
            System.out.print(A[i]+",");     
        }
        System.out.println("");  
    }    
}
