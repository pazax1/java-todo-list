import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileManager {
    private ArrayList<String> toDoList;

    public FileManager(ArrayList<String> toDoList) {
        this.toDoList = toDoList;
    }

    public void saveTasks() {
        try (FileWriter writer = new FileWriter("tasklist.txt")) {
            for (int i = 0; i < toDoList.size(); i++) {
                writer.write(toDoList.get(i) + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error has occured");
        }
    }

    public void loadTasks() {
        try (BufferedReader reader = new BufferedReader(new FileReader("tasklist.txt"))){

            String line;

            while ((line = reader.readLine()) != null) {
                toDoList.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (IOException e) {
            System.out.println("An error has occured");
        }
    }

}
