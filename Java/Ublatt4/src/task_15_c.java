public class task_15_c {
    static public void main(String[] args) {
        String combinedArguments = String.join(";", args);

        int i = combinedArguments.lastIndexOf(".");
        if (i == -1) {
            System.err.println("Error");
            return;
        }
        String suffix = combinedArguments.substring(i);

        suffix = suffix.toUpperCase();
        System.out.println(suffix);
    }
}
