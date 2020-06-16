package ToDo;

public class Task {
    String name;
    String description;
    int priority;
    Person person;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public Task(String name, String description, int priority, Person person) {
        this.name = name;
        this.description = description;
        this.priority = priority;
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


    public String toStringOne() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }


    public String toStringTwo() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
