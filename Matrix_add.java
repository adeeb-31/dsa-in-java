import java.util.Scanner;
public class Matrix_add {

    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);

        System.out.println("enter no.of rows");

        int rows=sc.nextInt();

        System.out.println("enter no. of columns");

        int col=sc.nextInt();

        System.out.println("Element of Matrix A");

        int A[][]=new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){

                System.out.print("Element at["+i+"]["+j+"]");

                A[i][j]=sc.nextInt();
            }
        }
        //printing matrix A

        System.out.println("Matrix A");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){

                System.out.print(A[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("Element of MAtrix B");

        int B[][]=new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){

                System.out.print("Element at["+i+"]["+j+"]");

                B[i][j]=sc.nextInt();
            }
        }
        //printing Matrix B

        System.out.println("Matrix B");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){

                System.out.print(B[i][j]+" ");
            }
            System.out.println("\n");
        }
        //Adding both matrix

        System.out.println("Result of addition of both matrix: ");

        int C[][]=new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){

                C[i][j]=A[i][j]+B[i][j];

                System.out.print(C[i][j]+" ");
            }

            System.out.println("\n");
        }
    }    
}
