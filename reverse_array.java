public class reverse_array {
     public static void main(String[] args) {
        
        int A[]={1,2,3,4,5,6,7,8,9,10};

        int B[]=new int[10];

        for(int i=0;i<A.length;i++){
            B[i]=A[A.length-1-i];
        }
       
        System.out.println();

        System.out.println("Array A:");

        for(int x:A){
            System.out.print(x+",");
        }
        System.out.println();

        System.out.println("Reverse Array B:");
         for(int x:B){
            System.out.print( x+",");
        }

        


    }
    
    
}
