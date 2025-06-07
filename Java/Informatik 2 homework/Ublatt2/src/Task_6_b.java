import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task_6_b {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime now = todayDate.atTime(nowTime);
        LocalDateTime examDateTime = LocalDateTime.of(2025, 8, 5, 12, 0);
        Duration timeBetween = Duration.between(now, examDateTime);
        double amHours = (double) timeBetween.toMinutes() / 60;
        System.out.println(amHours);
    }
}
