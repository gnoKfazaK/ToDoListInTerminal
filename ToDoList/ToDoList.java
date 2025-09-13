import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    

    static class Todo
    {
        private ArrayList<Task> todo;
        boolean SUBTITLE = true; 
        int notCompletedtasks;
        static class Task
        {
            boolean isComplete;
            String description;
            
            public Task(String description)
            {
                // Constructor
                this.isComplete = false;
                this.description = description;
                
            }
            
            
            public void PrintTask()
            {
                System.out.printf(this.description);
                if(this.isComplete) 
                {
                    System.out.printf(" {Done}\n");
                }
                else
                {
                    System.out.printf(" {Not Done}\n");
                }
            }

        }

        public int size()
        {
            return this.todo.size();
        }

        public Todo()
        {
            // Constructor
            todo = new ArrayList<>(); 
            this.notCompletedtasks = 0;
        }

        public void addTask(String description)
        {
            Task task = new Task(description);
            this.todo.add(task);
            this.notCompletedtasks++;
            if(SUBTITLE) System.out.println(description + " added");
        }

        public void completeTask(int number)
        {
            if (number > this.size())
            {
                System.out.println("Task not exsisted.");
            }
            else
            {
                int idx = number - 1;
                this.todo.get(idx).isComplete = true;
                this.notCompletedtasks--;
                if(SUBTITLE) System.out.println(this.todo.get(idx).description + " completed");
            }
        }

        public void deleteTask(int number)
        {
            if (number > this.size())
            {
                System.out.println("Task not exsisted.");
            }
            else
            {
                int idx = number - 1;
                if(!this.todo.get(idx).isComplete) this.notCompletedtasks--;
                this.todo.remove(idx);
            }
        }

        public void viewTask()
        {
             
            System.out.println("+------------+");
            System.out.println("| To Do List |");
            System.out.println("+------------+");
            if(this.todo.size() <= 0)
            {
                System.out.println("All Tasks Done");
            }
            else
            {
                for(int i = 0; i < this.todo.size(); i++)
                {
                    System.out.printf("%d. ", i + 1);
                    this.todo.get(i).PrintTask();
                }
            }
            System.out.println("--------------------------------------------");
        }
    }
    
    public static void main(String [] args)
    {
        // System.out.println("This is a To Do List");

        Todo todo = new Todo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the To Do List");
        
        while(true)
        {
            
            System.out.println("Please Enter: Add(a)/Complete(c)/Delete(d)");
            String command = scanner.nextLine();

            if (command == "exit()") break; // End the program
        
                
            char action = command.charAt(0);
            if(action == 'a')
            {
                System.out.printf("Add: ");
                String task_add = scanner.nextLine();
                todo.addTask(task_add);
            }else if (action == 'c')
            {
                if(todo.notCompletedtasks <= 0) 
                {
                    System.out.println("All tasks are completed");
                    todo.viewTask();
                    continue;
                }
                else 
                {    System.out.printf("Complete: (Enter the number) ");
                    int number = Integer.parseInt(scanner.nextLine());
                    todo.completeTask(number);
                }
            }else if(action == 'd')
            {
                if(todo.size() <= 0)
                {
                    System.out.println("No tasks in list.");
                    todo.viewTask();
                    continue;
                }
                System.out.printf("Delete: (Enter the number) ");
                int number = Integer.parseInt(scanner.nextLine());
                todo.deleteTask(number);
            }
            else
            {
                System.out.println("Wrong command, please input again");
                continue;
            }
            todo.viewTask();
        }
    } 
}



