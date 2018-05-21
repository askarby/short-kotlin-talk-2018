package info.skarby.examples.example5;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class DelegationExample {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        TaskService taskService = new TaskService();
        Facade facade = new Facade(employeeService, taskService);
        facade.load();
        System.out.println("Employees: " + Stream.of(facade.getEmployeeNames()).collect(joining(", ")));
        System.out.println("Tasks: " + Stream.of(facade.getTasks()).collect(joining(", ")));
    }
}

interface Loadable {
    void load();
}

class Facade implements Loadable {
    private final EmployeeService employeeService;
    private final TaskService taskService;

    public Facade(EmployeeService employeeService, TaskService taskService) {
        this.employeeService = employeeService;
        this.taskService = taskService;
    }

    @Override
    public void load() {
        long start = System.currentTimeMillis();
        employeeService.load();
        taskService.load();
        System.out.println("It took " + (System.currentTimeMillis() - start) + "ms to load (in total)");
    }

    public String[] getEmployeeNames() {
        return employeeService.getEmployeeNames();
    }

    public String[] getTasks() {
        return taskService.getTasks();
    }
}

class EmployeeService implements Loadable {

    @Override
    public void load() {
        System.out.println("Loading employees");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String[] getEmployeeNames() {
        return new String[] { "Bob", "Alice", "Richard"};
    }
}

class TaskService implements Loadable {

    @Override
    public void load() {
        System.out.println("Loading tasks");
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String[] getTasks() {
        return new String[] { "Sand the floor", "Polish the car", "Paint the fence"};
    }
}


