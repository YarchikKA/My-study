import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;


public class TaskTest {
    public static void main(String[] args) {
        List<Task> list = new ArrayList<>();

        Random rand = new Random();
        int i = 1;

        while (list.size() < 10) {
            String des = "Testaufgabe" + i;
            int pri = rand.nextInt(1, 11);
            i++;

            try {
                Task t = new Task(des, pri);
                list.add(t);
            } catch (TaskException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getAttribute());
                System.out.println(e.getInvalidValue());
            }
        }
        OptionalInt minPriority = list.stream().mapToInt(Task::getPriority).sorted().findFirst();
        if (minPriority.isPresent()) {
            System.out.println(minPriority.getAsInt());

        }
    }

}
