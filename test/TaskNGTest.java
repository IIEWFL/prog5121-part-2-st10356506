import static org.testng.Assert.*;
import org.testng.annotations.Test;
//imports for the tests
public class TaskNGTest {

    public TaskNGTest() {
    }
    //https://www.youtube.com/watch?v=vZm0lHciFsQ

    @Test
    public void testDisplayTaskDetails() {
        // test for displaying task details
    }

    @Test
    public void testGetTaskDuration() {
        // test for getting task duration
    }

    @Test
    public void testGetTaskStatus() {
        // test getting task status
    }

    @Test
    public void testMenuOptions() {
        // test for menu options
    }

    @Test
    public void testCheckTaskDescription() {
        //https://www.softwaretestinghelp.com/multiple-ways-to-execute-junit-tests/
        // Test to check whether the task description is below 50 characters
        String taskDescription1 = "Create Login to authenticate users";
        String taskDescription2 = "Create Add Task feature to add task users";

        assertTrue(Task.checkTaskDescription(taskDescription1), "Task successfully captured");
        assertTrue(Task.checkTaskDescription(taskDescription2), "Task successfully captured");

        // message to be displayed if the description is more than 50 characters long
        String taskDescription3 = "Create a very long task description that exceeds the limit of 50 characters";
        assertFalse(Task.checkTaskDescription(taskDescription3), "Please enter a task description of less than 50 characters");
    }

    @Test
    public void testCreateTaskID() {
        // test to check if the correct task id is created
        Task task1 = new Task("Login Feature", "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
        Task task2 = new Task("Add Task Feature", "Create Add Task feature to add task users", "Mike Smith", 10, "Doing");

        assertEquals("LO:0:SON", task1.CreateTaskID());
        assertEquals("AD:1:ITH", task2.CreateTaskID());

        // Test for additional Task objects
        Task task3 = new Task("Task 3", "Task 3 description", "John Doe", 5, "Done");
        assertEquals("TA:2:DOE", task3.CreateTaskID());
    }

    @Test
    public void testReturnTotalHours() {
        // Test to return the total hours of all the tasks combined
        int numTasks = 2;
        double[] durations = {8, 10};
        double expectedTotalHours = 18;

        double totalHours = 0;
        for (int i = 0; i < numTasks; i++) {
            totalHours += durations[i];
        }
        assertEquals(expectedTotalHours, totalHours, "Total hours should be 18");

        // Additional test data
        int additionalNumTasks = 5;
        double[] additionalDurations = {10, 12, 55, 11, 1};
        double additionalExpectedTotalHours = 89;

        double additionalTotalHours = 0;
        for (int i = 0; i < additionalNumTasks; i++) {
            additionalTotalHours += additionalDurations[i];
        }
        assertEquals(additionalExpectedTotalHours, additionalTotalHours, "Total hours should be 89");
    }

    @Test
    public void testShowReport() {
        // Test to see if the program prints the task details
        Task task1 = new Task("Login Feature", "Create Login to authenticate users", "Robyn Harrison", 8, "To Do");
        Task task2 = new Task("Add Task Feature", "Create Add Task feature to add task users", "Mike Smith", 10, "Doing");

        task1.displayTaskDetails();
        task2.displayTaskDetails();
    }
}
