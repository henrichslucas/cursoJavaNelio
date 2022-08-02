import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        // instanciando data-hora e convertendo para texto

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        LocalDate date = LocalDate.now();
        LocalDateTime date_2 = LocalDateTime.now();
        Instant date_3 = Instant.now();

        LocalDate date_4 = LocalDate.parse("2022-07-27");
        LocalDateTime date_5 = LocalDateTime.parse("2022-07-27T01:30:26");
        Instant date_6 = Instant.parse("2022-07-27T01:30:26Z");
        Instant date_7 = Instant.parse("2022-07-27T01:30:26-03:00");

        LocalDate date_8 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime date_9 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate date_10 = LocalDate.of(2022, 7, 20);
        LocalDateTime date_11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println("d01 = " + date);
        System.out.println("d02 = " + date_2);
        System.out.println("d03 = " + date_3);
        System.out.println("d04 = " + date_4);
        System.out.println("d05 = " + date_5);
        System.out.println("d06 = " + date_6);
        System.out.println("d07 = " + date_7);
        System.out.println("d08 = " + date_8);
        System.out.println("d09 = " + date_9);
        System.out.println("d10 = " + date_10);
        System.out.println("d11 = " + date_11);

        System.out.println();

        System.out.println("d04 = " + date_4.format(fmt1));
        System.out.println("d04 = " + fmt1.format(date_4));
        System.out.println("d05 = " + date_5.format(fmt2));
        System.out.println("d06 = " + fmt3.format(date_6));
        System.out.println("d05 = " + date_5.format(fmt4));
        System.out.println("d06 = " + fmt5.format(date_6));

        // convertendo data-hora global para local

        

    }   
}
