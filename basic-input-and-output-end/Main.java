import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("We'll be learning ");
        System.out.print("the basics of Java");
        System.out.println("!");
        System.out.println("Source: Baeldung");

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int number = scanner.nextInt();
        double decimal = scanner.nextDouble();
        boolean flag = scanner.nextBoolean();
        System.out.println("Successfully read all user inputs.");

        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int userAge = scanner.nextInt();

        int ageIn5Years = userAge + 5;
        System.out.println();
        System.out.println("--- Future Prediction ---");
        System.out.print("Name: ");
        System.out.println(userName);
        System.out.print("Age in 5 years: ");
        System.out.println(ageIn5Years);

        scanner.close();
    }

}
