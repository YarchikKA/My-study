public class Task {
    String description;
    int priority;

    public Task(String description, int priority) {
        this.setDescription(description);
        this.setPriority(priority);
    }

    public Task(String description) {
        this.setDescription(description);
        this.setPriority(1);
    }

    public static Task prioritize(Task task1, Task task2) {
        if (task1.getPriority() > task2.getPriority()) {
            return task2;
        } else if (task1.getPriority() < task2.getPriority()) {
            return task1;
        } else {
            double coinValue = Math.random();
            if (coinValue > 0.5) {
                return task1;
            } else {
                return task2;
            }
        }
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "  Task '" + description + "' with priority " + priority;
    }

    public boolean equals(Object anObject) {
        if (anObject == null || !(anObject instanceof Task taskB)) {
            return false;
        }
        return this.getDescription().equals(taskB.getDescription());
    }
}
