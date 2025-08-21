import java.util.*;
public class Searching_element {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        

        int A[]={1,2,3,4,5,10,15,16,20};
        System.out.println("Enter the element you want to search");

        int key=sc.nextInt();
        
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
                System.out.println("Element is at index :"+i);
                System.exit(0);
            }
        }
        System.out.println("Element not found");
    }
    
}
