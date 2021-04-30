package ToDoList;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        ArrayList<String> toDoList= new ArrayList<String>();
        ToDo todolist = new ToDo(toDoList);
        boolean quit = false;
        int choice=0;
        while(!quit) {
            System.out.print("Enter the operation to perform: ");
            if(todolist.scanner.hasNextInt()) {
                choice= todolist.scanner.nextInt();
                todolist.scanner.nextLine();
                switch(choice) {
                    case 0:
                        todolist.showInstructions();
                        break;
                    case 1:
                        todolist.addToDo();
                        break;

                    case 2:
                        todolist.deleteToDo();
                        break;

                    case 3:
                        todolist.replaceToDO();
                        break;

                    case 4:
                        System.out.println("Displaying the tasks: ");
                        todolist.showList(toDoList);
                        break;

                    case 5:
                        todolist.searchToDo();
                        break;

                    case 6:
                        System.out.println("Quitting the app");
                        quit=true;

                    default:
                        System.out.println("Press 0 for instruction list");
                }
            }
            else {
                System.out.println("Input Error!");
                todolist.scanner.nextLine();
            }
        }
        todolist.scanner.close();
    }
}
