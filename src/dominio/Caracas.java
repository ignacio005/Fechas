package dominio;
import java.time.*;
import java.util.ArrayList;
import java.util.TimeZone;

public class Caracas {
	
	public static void fechaCaracas() {
		LocalDateTime x = LocalDateTime.now();
		LocalDateTime y = LocalDateTime.now(TimeZone.getTimeZone("America/Caracas").toZoneId());
		System.out.println("En Caracas, la fecha y hora actual es " + y + ".");
		System.out.println("La diferencia horaria entre Madrid y Caracas es " + (x.getHour()- y.getHour())+ " horas.");


	}


}
