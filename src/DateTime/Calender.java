package DateTime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Calender {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("date====>" + date);

        LocalTime time  = LocalTime.now();
        System.out.println("time====>" + time);

        LocalDateTime current = LocalDateTime.now();
        System.out.println("current====>" + current);

        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("DD-MM-YYYY");
        String formatted = date.format(dateformat);

        System.out.println("formatted====>" + formatted);



    }
}
