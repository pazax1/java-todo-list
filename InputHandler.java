import java.util.Scanner;

public class InputHandler {
    
    private Scanner scanner;
    
    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    String getTaskName() {
        return scanner.next();
    }

    int getMenuChoice() {
        int choice = 0; 

        boolean correctChoice = false;
        while (!correctChoice) {

            try {
                choice = scanner.nextInt();
                if (choice <= 0 || choice > 4) {
                    ErrorHandler.wrongNumberError();
                    
                } else {
                    correctChoice = true;
                }
                
            }

            catch (java.util.InputMismatchException e) {
                ErrorHandler.wrongOptionError();
                this.getTaskName();
            }

        }
        return choice;
    }

    int getTaskNum() {
        int taskNum = 0;

        boolean correctTaskNum = false;
        while (!correctTaskNum) {
            try {
                taskNum = scanner.nextInt();
                correctTaskNum = true;
            }

            catch (java.util.InputMismatchException e) {
                ErrorHandler.wrongOptionError();
                this.getTaskName();
            }
        } 
        return taskNum;
    }
}


