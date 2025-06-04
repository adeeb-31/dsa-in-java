/**
 * CountingLoops.java
 * This program demonstrates various types of counting loops in Java.
 */
public class CountingLoops {
    public static void main(String[] args) {
        System.out.println("Java Counting Loops Examples");
        System.out.println("===========================\n");
        
        // For Loop Examples
        System.out.println("1. FOR LOOPS:");
        System.out.println("-------------");
        
        // Basic for loop counting up
        System.out.println("Counting up from 1 to 5 (for loop):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // For loop counting down
        System.out.println("Counting down from 10 to 1 (for loop):");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // For loop with step count
        System.out.println("Counting by 2s from 0 to 10 (for loop):");
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // While Loop Examples
        System.out.println("2. WHILE LOOPS:");
        System.out.println("---------------");
        
        // Basic while loop counting up
        System.out.println("Counting up from 1 to 5 (while loop):");
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println("\n");
        
        // While loop counting down
        System.out.println("Counting down from 10 to 1 (while loop):");
        count = 10;
        while (count >= 1) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println("\n");
        
        // While loop with step count
        System.out.println("Counting by 3s from 0 to 15 (while loop):");
        count = 0;
        while (count <= 15) {
            System.out.print(count + " ");
            count += 3;
        }
        System.out.println("\n");
        
        // Do-While Loop Examples
        System.out.println("3. DO-WHILE LOOPS:");
        System.out.println("------------------");
        
        // Basic do-while loop counting up
        System.out.println("Counting up from 1 to 5 (do-while loop):");
        count = 1;
        do {
            System.out.print(count + " ");
            count++;
        } while (count <= 5);
        System.out.println("\n");
        
        // Do-while loop counting down
        System.out.println("Counting down from 10 to 1 (do-while loop):");
        count = 10;
        do {
            System.out.print(count + " ");
            count--;
        } while (count >= 1);
        System.out.println("\n");
        
        // Do-while loop with step count
        System.out.println("Counting by 5s from 0 to 20 (do-while loop):");
        count = 0;
        do {
            System.out.print(count + " ");
            count += 5;
        } while (count <= 20);
        System.out.println("\n");
        
        // Practical Example: Sum calculation
        System.out.println("4. PRACTICAL EXAMPLES:");
        System.out.println("---------------------");
        
        // Sum of numbers from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Factorial calculation using while loop
        int num = 5;
        int factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
        
        // Fibonacci sequence using for loop (first 10 numbers)
        System.out.println("First 10 Fibonacci numbers:");
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (i = 2; i < 10; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println("\n");
    }
}

