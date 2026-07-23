import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    static void toDoMethod() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<String>();
        
        InputHandler inputHandler = new InputHandler(scanner);
        FileManager fileManager = new FileManager(toDoList);
        TaskManager taskManager = new TaskManager(inputHandler, toDoList); 
        
        int choice = 0;
        fileManager.loadTasks();

        while (choice != 4) {
            Menu.showMenu();
            choice = inputHandler.getMenuChoice();

            switch (choice) {
                case 1: // add task case
                    taskManager.addTask();
                    break;

                case 2: // remove task case
                    taskManager.removeTask();
                    break;

                case 3: // show to do list case
                    taskManager.showTasks();
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Goodbye!");
                    fileManager.saveTasks();
                    break;
            }
        }
        scanner.close();
    }      
}