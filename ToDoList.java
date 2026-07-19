public class ToDoList {

    static void toDoMethod() {
        TaskManager taskManager = new TaskManager();
        InputHandler inputHandler = new InputHandler();

        int choice = 0;

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
                    break;
            }
        }
    }      
}