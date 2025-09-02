import java.util.Scanner;

public class Matrix_mult {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter rows of 1st matrix: ");

        int r1=sc.nextInt();

        System.out.println("Enter column of 1st matrix");

        int c1=sc.nextInt();

        //2nd matrix

        System.out.println("Enter rows of 2nd matrix: ");

        int r2=sc.nextInt();

        System.out.println("Enter column of 2nd matrix");

        int c2=sc.nextInt();

        //multiplication condition

        if(r1!=c2){
            System.out.println("Matrix multiplication not possible!");
            return;
        }
        

        int A[][]=new int[r1][c1];
        int B[][]=new int[r2][c2];
        int C[][]=new int[r1][c2];

        //inputing 1st matrix elements

        System.out.println("Enter elements of 1st Matrix");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){

                A[i][j]=sc.nextInt();
            }
        }

        //inputing 2nd matrix elements

        System.out.println("Enter elements of 2nd Matrix");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){

                B[i][j]=sc.nextInt();
            }
        }

        //mltiplying both matrix

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
               for (int k = 0; k < c1; k++){
                     C[i][j] += A[i][k] * B[k][j];
                    

                }   
            }
        }

        //displaying result

        System.out.println("Result of multiplication is: ");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){

                System.out.print(C[i][j]+" ");

            }

            System.out.println("\n");
        }

    }
    
}
