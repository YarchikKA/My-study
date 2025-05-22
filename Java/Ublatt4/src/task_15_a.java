public class task_15_a {
    public static void main(String[] args) {
        StringBuilder combinedArguments = new StringBuilder();
        for (String arg : args) {
            if (arg.equals("LINEBREAK")) {
                System.out.println(combinedArguments.toString());
                combinedArguments.setLength(0);
            } else {
                combinedArguments.append(arg).append(" ");
            }
        }
    }
}
