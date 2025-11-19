import com.baeldung.domain.Task;

public class Main {

    public static void main(String[] args) {
        System.out.println("Initial task counter:");
        System.out.println(Task.publicTaskCounter);
        Task task1 = new Task("Task One", "[Task One]: learn Java basics");
        Task task2 = new Task("Task Two", "[Task Two]: learn about constructors");
        System.out.println("After creating two tasks:");
        System.out.println(Task.publicTaskCounter);

        System.out.println("\n-------------------------\n");
        System.out.println("Attempting to set an invalid description:");
        task1.setDescription(null);

        System.out.println("\n-------------------------\n");
        Task task3 = new Task("Task Three", "[Task Three]: learn about classes");
        Task task4 = new Task("Task Four", "[Task Four]: learn about methods");
        System.out.println("task3's name:");
        System.out.println(task3.getName());
        System.out.println("task4's name:");
        System.out.println(task4.getName());

    }

}