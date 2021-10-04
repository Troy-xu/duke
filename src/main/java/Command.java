

public abstract class Command {
    TaskList taskList;

    public abstract CommandResult execute();

    public void inputData(TaskList taskList) {
        this.taskList = taskList;
    }

    public String addTaskSuccess(Task task) {
        return "Got it. I have added the task!\n" + task
                + "Now you have " + taskList.getSize() + " tasks in the list.";

    }
}