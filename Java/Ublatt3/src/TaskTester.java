public class TaskTester {
    public static void printTask(Task task) {
        System.out.println(task);
    }

    public static void printPriorityTask(Task task1, Task task2) {
        System.out.println(Task.prioritize(task1, task2));
    }

    public static void printTaskEquality(Task task1, Task task2) {
        if (task1.equals(task2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    static public void main(String[] args) {
        Task task1 = new Task("rrr");
        Task task2 = new Task("rr", 5);
        Task task3 = new Task("rr");
        printTask(task1);
        printTask(task2);
        printTask(task3);
        printTaskEquality(task2, task3);
        printPriorityTask(task1, task2);

        for (int i = 0; i < 10; i++) {
            printPriorityTask(task2, task3);
        }


    }
}
