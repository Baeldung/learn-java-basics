public class Main {

    public static void main(String[] args) {
        // Declaring array of integers
        int[] scores = new int[5];

        // Declaring and initialing an array in a single step
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Assessing and printing the first index
        int firstNumber = numbers[0];
        System.out.println("The first number is: " + firstNumber);

        // Assigning values to scores array
        scores[0] = 5;
        scores[1] = 10;
        scores[2] = 15;
        scores[3] = 20;
        scores[4] = 25;

        // Modifying the second element of numbers array
        System.out.println("The second score is initially: " + scores[1]);
        scores[1] = 25;
        System.out.println("The second score is now: " + scores[1]);

        // Iterating over an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Iterating over an array using enhance for loop
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
