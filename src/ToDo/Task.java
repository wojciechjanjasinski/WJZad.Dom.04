package ToDo;

public class Task {
    String name;
    String description;
    int priority;
    Person person;

    Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    Task(String name, String description, int priority, Person person) {
        this(name, description, priority);
        this.person = person;
    }

    boolean highPriority() {
        return this.priority > 0;
    }

    boolean mediumPriority() {
        return this.priority == 0;
    }

    boolean lowPriority() {
        return this.priority < 0;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", person=" + person +
                '}';
    }
}
