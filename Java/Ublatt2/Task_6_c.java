import java.time.LocalDateTime;

public class Task_6_c {
    public static void main(String[] args) {
        LocalDateTime nextMeeting = LocalDateTime.now().withHour(10).withMinute(0).withSecond(0).withNano(0);

        LocalDateTime[] thisMonth = new LocalDateTime[31];
        int count = 0;
        while (nextMeeting.getMonth() == LocalDateTime.now().getMonth()) {
            if (nextMeeting.getDayOfWeek().getValue() != 6 && nextMeeting.getDayOfWeek().getValue() != 7) {
                thisMonth[count] = nextMeeting;
                count++;
            }
            nextMeeting = nextMeeting.plusDays(1);

        }
        System.out.println(count + " Tage:" );
        for (LocalDateTime day : thisMonth) {
            if (day != null) {
                System.out.println(day.getDayOfWeek() + ": " + day.toLocalDate() + " " + day.toLocalTime());

            }
        }
    }
}
