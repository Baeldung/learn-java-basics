public class Main {

    public static void main(String[] args) {

        int sales = 1200;
        if (sales > 1000) {
            System.out.println("Congratulations, you've earned a bonus!");
        }
        System.out.print("Your final sales amount is ");
        System.out.println(sales);

        int userAge = 17;
        if (userAge >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not yet eligible to vote.");
        }

        int score = 85;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.print("Your grade is: ");
        System.out.println(grade);

        boolean isLoggedIn = true;
        boolean isAdmin = false;

        if (isLoggedIn) {
            System.out.println("Welcome, user!");
            if (isAdmin) {
                System.out.println("Admin panel access granted.");
            } else {
                System.out.println("You do not have admin privileges.");
            }
        } else {
            System.out.println("Please log in to continue.");
        }

        int menuChoice = 2;

        switch (menuChoice) {
            case 1:
                System.out.println("Starting a new game...");
                break;
            case 2:
                System.out.println("Loading saved game...");
                break;
            case 3:
                System.out.println("Opening options menu...");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        char mark = 'B';
        switch (mark) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("Passing grade");
                break;
            case 'D':
            case 'F':
                System.out.println("Failing grade");
                break;
            default:
                System.out.println("Unknown grade");
        }

        switch (mark) {
            case 'A', 'B', 'C' -> System.out.println("Passing grade");
            case 'D', 'F' -> System.out.println("Failing grade");
            default -> System.out.println("Unknown grade");
        }

        String reptileName = "Crocodile";
        int reptileCode = switch (reptileName) {
            case "Snake" -> 1;
            case "Crocodile" -> 2;
            default -> 0;
        };
        System.out.println(reptileCode);

        boolean isMember = true;

        double price;
        if (isMember) {
            price = 15.00;
        } else {
            price = 20.00;
        }
        System.out.print("Price with if-else: $");
        System.out.println(price);

        double ternaryPrice = isMember ? 15.00 : 20.00;
        System.out.print("Price with ternary: $");
        System.out.println(ternaryPrice);

    }
}
