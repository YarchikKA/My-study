public class TaskException extends Exception {
    String attribute;
    String invalidValue;


    public TaskException(String attribute, String invalidValue) {
        super("A tasks description must not be empty." +
                " A tasks priority must be between 1 and 5 (inclusive)");
        this.attribute = attribute;
        this.invalidValue = invalidValue;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getInvalidValue() {
        return invalidValue;
    }
}
