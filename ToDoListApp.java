


import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    static ArrayList<String> tasks = new ArrayList<>();
    static ArrayList<Boolean> completed = new ArrayList<>();

    // Method to add a task
    public static void addTask(String task) {
        tasks.add(task);
        completed.add(false);
        System.out.println("Task added successfully!");
    }

    // Method to display tasks
    public static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n--- To-Do List ---");
        for (int i = 0; i < tasks.size(); i++) {
            String status = completed.get(i) ? "[Completed]" : "[Pending]";
            System.out.println((i + 1) + ". " + tasks.get(i) + " " + status);
        }
    }

    // Method to delete a task
    public static void deleteTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }
        tasks.remove(index);
        completed.remove(index);
        System.out.println("Task deleted successfully!");
    }

    // Method to mark task as complete
    public static void markComplete(int index) {
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }
        completed.set(index, true);
        System.out.println("Task marked as completed!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Mark Task as Complete");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    addTask(task);
                    break;

                case 2:
                    displayTasks();
                    break;

                case 3:
                    System.out.print("Enter task number to mark complete: ");
                    int completeIndex = sc.nextInt() - 1;
                    markComplete(completeIndex);
                    break;

                case 4:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = sc.nextInt() - 1;
                    deleteTask(deleteIndex);
                    break;

                case 5:
                    System.out.println("Exiting To-Do List Application.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
