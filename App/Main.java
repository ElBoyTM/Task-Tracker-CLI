import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("1) Add 2) List 3) Complete 4) Delete 5) Exit");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Enter task name: ");
                    manager.addTask(scanner.nextLine());
                    break;
                case "2":
                    manager.listTasks();
                    break;
                case "3":
                    System.out.print("Enter task number to complete: ");
                    manager.markTaskComplete(Integer.parseInt(scanner.nextLine()));
                    break;
                case "4":
                    System.out.print("Enter task number to delete: ");
                    manager.deleteTask(Integer.parseInt(scanner.nextLine()));
                    break;
                case "5":
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}
