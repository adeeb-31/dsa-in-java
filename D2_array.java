import java.util.Scanner;
public class D2_array {
    
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter numer of rows");

       int  rows=sc.nextInt();

       System.out.println("enter no. of columns");

       int columns=sc.nextInt();

       int A[][]=new int[rows ][columns];

       for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){

            System.out.print("Element at["+i+"]["+j+"]");

            A[i][j]=sc.nextInt();

        }
       }

       //2d array print

       System.out.println("2D array is: ");

       for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){

            System.out.print( A[i][j]+"  ");
        }
        System.out.println("\n");

       }


    
    }
    
}
