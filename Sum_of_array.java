import java.util.Scanner;

public class Sum_of_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");

        int size = sc.nextInt();

        int a[] = new int[size];

        int sum = 0;

        System.out.println("Enter elements of array :" + size);

        for (int i = 0; i < a.length; i++) {

            a[i] = sc.nextInt();

            sum = sum + a[i];
        }
        System.out.println("Sum of arrray is:" + sum);
    }
}
