package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {

    private ArrayList<String> toDoList = new ArrayList<String>();
    public static Scanner scanner = new Scanner(System.in);

    public ToDo(ArrayList<String> toDoList) {
        this.toDoList = toDoList;
    }

    private void insertEntry(String newEntry){
        if(newEntry.isEmpty())
            System.out.println("Please enter something");
        else
            toDoList.add(newEntry);
    }

    private void deleteEntry(int entryPosition) {
        toDoList.remove(entryPosition);
        String toDeletedTask=toDoList.get(entryPosition);
        System.out.println("Removed task name "+toDeletedTask+" from the list.");
    }

    private void modifyEntry(String someEntry,int entryPosition) {
            toDoList.set(entryPosition,someEntry);
            System.out.println("Task number "+(entryPosition+1)+" has been modified");
    }

    private String searchEntry(String newEntry) {
        //boolean entryCheck=toDoList.contains(newEntry);
        int taskPosition = toDoList.indexOf(newEntry);
        if(taskPosition >=0)
            return toDoList.get(taskPosition);
        return null;
    }

    public void showInstructions() {
        System.out.println("Press");
        System.out.println("0 - Instruction list");
        System.out.println("1 - Add tasks");
        System.out.println("2 - Remove tasks");
        System.out.println("3 - Replace tasks");
        System.out.println("4 - See today's tasks");
        System.out.println("5 - Search a task");
        System.out.println("6 - Quit the app.");
    }

    public void showList(ArrayList<String> toDoList) {
        System.out.println("You have "+toDoList.size()+" things to do today!!");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i+1)+". "+toDoList.get(i));
        }
    }

    public void addToDo() {
        System.out.print("What do you want to complete today? ");
        String addTask = scanner.nextLine();
        insertEntry(addTask);
    }

    public void deleteToDo() {
        System.out.print("Which task number to remove? ");
        if( scanner.hasNextInt() ) {
            int entryPosition = scanner.nextInt();
            entryPosition--;
            deleteEntry(entryPosition);
        }
        else {
            System.out.println("Error!");
            scanner.nextLine();
        }
    }

    public void replaceToDO() {

        System.out.println("Replace which task number? ");
        if( scanner.hasNextInt() ) {
            int entryPosition = scanner.nextInt();
            scanner.nextLine();
            System.out.println("New task? ");
            String newEntry  = scanner.nextLine();
            entryPosition--;
            modifyEntry(newEntry,entryPosition);
        }
        else {
            System.out.println("Error!");
            scanner.nextLine();
        }
    }

    public void searchToDo() {
        System.out.println("Enter task name to search: ");
        String newEntry=scanner.nextLine();
        if(newEntry.isEmpty()) {
            System.out.println("Enter something to search");
        }
        else {
            String searchResult=searchEntry(newEntry);
            if(searchResult!=null)
                System.out.println("The task "+searchResult+" is present.");
            else
                System.out.println("The task is not present in today's task.");
        }
    }
}
