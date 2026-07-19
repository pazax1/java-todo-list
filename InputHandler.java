import java.util.Scanner;

public class InputHandler {
    Scanner scanner = new Scanner(System.in);
    int getMenuChoice() {
        int choice = 0; 

        boolean correctChoice = false;
        while (!correctChoice) {

            try {
                choice = scanner.nextInt();
                if (choice <= 0 || choice > 4) {
                    ErrorHandler.wrongNumberError();
                    
                }

                correctChoice = true;
                
            }

            catch (java.util.InputMismatchException e) {
                ErrorHandler.wrongOptionError();
                scanner.next();
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
                scanner.next();
            }
        } 
        return taskNum;
    }
}


