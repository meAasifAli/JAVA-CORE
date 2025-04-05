
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date); // Display the current date
        LocalTime time = LocalTime.now();
        System.out.println(time); // Display the current time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime); // Display the current date and time

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }

}
