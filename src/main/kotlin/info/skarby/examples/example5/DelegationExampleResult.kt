package info.skarby.examples.example5

import java.util.stream.Collectors.joining
import java.util.stream.Stream

fun main(args: Array<String>) {
    val employeeService = EmployeeServiceImpl();
    val taskService = TaskServiceImpl();
    val facade = KFacade(employeeService, taskService);
    facade.load()
    println("Employees: " + Stream.of(*facade.employeeNames).collect(joining(", ")))
    println("Tasks: " + Stream.of(*facade.tasks).collect(joining(", ")))
}

interface KLoadable {
    fun load()
}

class KFacade(private val employeeService: KEmployeeService, private val taskService: KTaskService) :
        KEmployeeService by employeeService, KTaskService by taskService {

    override fun load() {
        val start = System.currentTimeMillis()
        employeeService.load()
        taskService.load()
        println("It took ${System.currentTimeMillis() - start}ms to load (in total)")
    }
}

interface KEmployeeService : KLoadable {
    val employeeNames: Array<String>
}

class EmployeeServiceImpl : KEmployeeService {

    override val employeeNames: Array<String>
        get() = arrayOf("Bob", "Alice", "Richard")

    override fun load() {
        println("Loading employees")
        try {
            Thread.sleep(300)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

    }
}

interface KTaskService : KLoadable {
    val tasks: Array<String>
}

class TaskServiceImpl : KTaskService {

    override val tasks: Array<String>
        get() = arrayOf("Sand the floor", "Polish the car", "Paint the fence")

    override fun load() {
        println("Loading tasks")
        try {
            Thread.sleep(150)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

    }
}

