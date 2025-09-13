# ToDoListInTerminal
This is my first mini project using Java.<br>
I used an arraylist of Task class to act as a To Do List. <br>
``` Arraylist<Task> ```

## How to use
Type 'a' to add a task, then input the task.
Type 'c' to complete a task, then input the NUMBER of the task.
Type 'd' to delete a task, then input the NUMBER of the task.

## Classes/Functions
This project have a class called Todo also a class in Todo called Task.<br>

### class Todo{}
This class contains 5 functions, <br>
```
public int size()
public void addTask(String description)
public void completeTask(int number)
public void deleteTask(int number)
public void viewTask()
```

2 variables
```
boolean SUBTITLE = true; 
int notCompletedtasks;
```

### class Task{}
```
boolean isComplete;
String description;
public void PrintTask();
```

