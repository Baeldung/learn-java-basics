public class Main {

    public static void main(String[] args) {
        Task task1 = new Task();
        task1.description = "[Task One]: learn Java basics";
        task1.completed = true;
        task1.workedHours = 5;

        Task task2 = new Task();
        task2.description = "[Task Two]: build a simple project";
        task2.completed = false;

        System.out.println(task1.description);
        System.out.println(task2.description);

        System.out.println("\n-------------------------\n");
        System.out.println("Using the custom constructor:");
        Task task3 = new Task("[Task Three]: Learn about constructors");
        System.out.println(task3.description);
        System.out.println(task3.completed);
        System.out.println(task3.workedHours);

        System.out.println("\n-------------------------\n");
        System.out.println("Primitive types:");
        int qtyOfTasks = 2;
        int aCopy = qtyOfTasks;
        aCopy = 1234;
        System.out.println("qtyOfTasks: " + qtyOfTasks);
        System.out.println("aCopy: " + aCopy);

        System.out.println("\n-------------------------\n");
        System.out.println("Reference types:");
        Task originalReference = new Task("Learn about constructors");
        Task copiedReference = originalReference;

        copiedReference.description = "A Modified Task";
        System.out.println("originalReference description: " + originalReference.description);
        System.out.println("copiedReference description: " + copiedReference.description);

    }

}