import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DeadlinesCommand extends Command {
    public static final String COMMAND_WORD = "deadline";
    String taskName;
    LocalDate on;

    DeadlinesCommand(String argumentText) throws DukeException, DateTimeParseException {
        String[] deadParts = argumentText.split(" /at ");
        if (deadParts[0].equals("") || deadParts[1].equals("")) {
            throw new DukeException("The description of an deadline cannot be empty");
        } else {
            this.taskName = deadParts[0];
            this.on = LocalDate.parse(deadParts[1]);
        }
    }

    @Override
    public CommandResult execute() {
        Task newDeadlines = new Deadlines(taskName, false, on);
        taskList.addTasks(newDeadlines);
        return new CommandResult(addTaskSuccess(newDeadlines));
    }
}