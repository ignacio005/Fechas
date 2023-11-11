package dominio;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class LlegadaLuna {

    public static void Luna(){

        LocalDateTime FechaMadrid = LocalDateTime.of(1969, 7,21,3,56);
        System.out.println("La fecha y hora en Madrid cuando Neil Armstrong pisó la Luna es " + FechaMadrid + ".");
        LocalTime HoraMadrid = LocalTime.of(3,56);
        LocalTime HoraCaracas = HoraMadrid.minus(5, ChronoUnit.HOURS);
        LocalDate DiaMadrid = LocalDate.of(1969, 7,21);
        LocalDate DiaCaracas = DiaMadrid.minus(1,ChronoUnit.DAYS);
        System.out.println("La fecha y hora en Caracas cuando Neil Armstrong pisó la Luna es " + DiaCaracas + "T" + HoraCaracas+ ".");
    }
}
