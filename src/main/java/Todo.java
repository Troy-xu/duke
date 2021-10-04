public class Todo extends Task {
    Todo(String name, boolean isDone) {
        super(name, isDone);
    }

    @Override
    public Task complete() {
        return new Todo(this.getName(),true);
    }

    @Override
    public Task setName(String newName) {
        return new Todo(newName, isDone);
    }
}