import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 2. The for Loop - Basic example
        System.out.println("=== For Loop Example ===");
        for (int i = 1; i <= 5; i++) {
            System.out.print("The number is: ");
            System.out.println(i);
        }

        // For loop with empty initialization
        System.out.println("\n=== For Loop with Empty Initialization ===");
        int i = 0;
        for (; i < 5; i++) {
            System.out.print("The number is ");
            System.out.println(i);
        }

        // 3. The while Loop
        System.out.println("\n=== While Loop Example ===");
        Scanner scanner = new Scanner(System.in);
        int j = 0;

        // the remainder of a division by 2 is 0 if it's an even number
        while (j % 2 == 0) {
            System.out.println("Input an odd number to continue");
            j = scanner.nextInt();
        }

        // 4. The do-while Loop
        System.out.println("\n=== Do-While Loop Example ===");
        int k;
        do {
            System.out.println("Again input an odd number to continue");
            k = scanner.nextInt();
        } while (k % 2 == 0);

        // 5. Nested Loops Example
        System.out.println("\n=== Nested Loops Example ===");
        int rows = 3, cols = 4;
        int num = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(num++);
                System.out.print("\t"); // tab character
            }
            System.out.println();
        }

        // 6. Controlling Loops With break and continue
        System.out.println("\n=== Break Statement Example ===");
        for (int l = 1; l <= 5; l++) {
            if (l == 3) {
                System.out.println("Found the number 3. Exiting the loop.");
                break;
            }
            System.out.print("Processing number: ");
            System.out.println(l);
        }

        System.out.println("\n=== Continue Statement Example ===");
        for (int m = 1; m <= 5; m++) {
            if (m % 2 == 0) {
                System.out.print("Skipping even number: ");
                System.out.println(m);
                continue;
            }
            System.out.print("Processing odd number: ");
            System.out.println(m);
        }
    }
}
