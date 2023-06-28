package ar.edu.unlam;

import java.util.Calendar;
/**
* Clase que permite obtener la fecha y hora actual,
* en milisegundos desde la época
*/
public class Reloj {
public static long ahora() {
return Calendar.getInstance().getTimeInMillis();
}
}
