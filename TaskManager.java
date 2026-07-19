import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    Scanner scanner = new Scanner(System.in);
    InputHandler inputHandler = new InputHandler();
    ArrayList<String> toDoList = new ArrayList<String>();

    void addTask() {
            String toDoTask = "";
            System.out.println("-------------------------");
            System.out.print("Task to add: ");
            toDoTask = scanner.next();
            System.out.println("-------------------------");
            toDoList.add(toDoTask);
    }

    void removeTask() {
            int taskNum = 0;
            if (toDoList.isEmpty()) {
                    ErrorHandler.noTasksEror();
                    return;
                }

            System.out.println("-------------------------");
            System.out.print("Task to remove: ");
            boolean correctRemoveNum = false;

            while (!correctRemoveNum) { // the remove index is correct
                    taskNum = inputHandler.getTaskNum();

                    if (taskNum > toDoList.size() || taskNum <= 0) { // the remove index is higher than the array size or lower than 0 
                        ErrorHandler.wrongNumberError();
                    }

                   else { // the remove number index is correct
                        toDoList.remove(taskNum - 1);
                        correctRemoveNum = true;
                        System.out.println("-------------------------");
                    }
                
            }
        }

        void showTasks() {

            if (toDoList.isEmpty()) {
                    System.out.println("-------------------------");
                    System.out.println("No tasks to show");            
                }
                
            else {
                System.out.println("-------------------------");
                for (int i = 0; i < toDoList.size(); i++) {
                    System.out.println(i + 1 + ". " +toDoList.get(i));
                }
            }

            System.out.println("-------------------------");
        }
}