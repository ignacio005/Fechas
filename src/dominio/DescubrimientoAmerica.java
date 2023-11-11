package dominio;
import java.time.*;

public class DescubrimientoAmerica {
    public static void descubrimiento(){
        int añodescubrimiento= 1492;
        LocalDate actualidad =LocalDate.now();
        int resultado= actualidad.getYear()-añodescubrimiento;
        System.out.println("Han transcurrido " + resultado + " años desde el descubrimiento de América.");
    }
}
