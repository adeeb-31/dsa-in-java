import java.util.Scanner;

public class Increasing_size_array {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int A[]={1,2,3,4,5};

        System.out.println("Size of array A:"+A.length);

        int B[]=new int[2*A.length];

        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }

        int n=A.length;
       
        System.out.println("new length of A :"+B.length);

        System.out.println("Do you want to add new elements? (1-Yes / 2-No)");

         try {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("How many new elements do you want to insert?");
                    int count = sc.nextInt();

                    // Prevent overflow
                    if (n + count > B.length) {
                        System.out.println("Error: Not enough space to add " + count + " elements.");
                        break;
                    }

                    for (int i = 0; i < count; i++) {
                        System.out.println("Enter new element:");
                        int value = sc.nextInt();
                        B[n] = value;
                        n++;
                    }

                    System.out.print("Updated Array B: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(B[i] + ",");
                    }
                    break;

                case 2:
                    System.out.println("No elements added. Final Array: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(B[i] + ",");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid index.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}