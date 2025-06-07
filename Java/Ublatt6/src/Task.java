public class Task {
    private String description;
    private int priority;

    public Task(String description) throws TaskException {
        checkDescription(description);
        setDescription(description);
        setPriority(1);
    }

    public Task(String description, int priority) throws TaskException {
        checkDescription(description);
        checkPriority(priority);
        setDescription(description);
        setPriority(priority);
    }

    public static Task prioritize(Task task1, Task task2) {
        if (task1.getPriority() < task2.getPriority()) {
            return task1;
        } else if (task2.getPriority() < task1.getPriority()) {
            return task2;
        } else {
            if (Math.random() < 0.5) {
                return task1;
            } else {
                return task2;
            }
        }
    }

    public void checkDescription(String description) throws TaskException {
        if (description == null || description.isEmpty()) {
            throw new TaskException("description", description);
        }
    }

    public void checkPriority(int priority) throws TaskException {
        if (priority > 5 || priority < 1) {
            throw new TaskException("priority", String.valueOf(priority));
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws TaskException {
        checkDescription(description);
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) throws TaskException {
        checkPriority(priority);
        this.priority = priority;
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;
        }
        if (anObject.getClass().equals(Task.class)) {
            Task t = (Task) anObject;
            return this.getDescription().contentEquals(t.getDescription());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return description + " (" + priority + ")";
    }
}