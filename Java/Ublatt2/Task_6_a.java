import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Task_6_a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bDate = input.nextLine();
        LocalDate db = LocalDate.parse(bDate);
        LocalDate toDayDate = LocalDate.now();
        while (!db.isAfter(toDayDate)) {
            db = db.plusYears(1);
        }
        long daysBetween = ChronoUnit.DAYS.between(toDayDate, db);


        System.out.println(daysBetween);
        System.out.print(db);
    }
}