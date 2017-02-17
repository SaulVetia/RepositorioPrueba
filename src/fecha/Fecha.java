package fecha;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    int dia;
    int mes;
    int anio;
    static int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
    static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha() {
        Calendar c = new GregorianCalendar();
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH);
        anio = c.get(Calendar.YEAR);
    }

    public void bisiesto() {
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            diasMes[1] = 29;
        } else {
            diasMes[1] = 28;
        }
    }

    public void bisiesto(int anio) {
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            diasMes[1] = 29;
        } else {
            diasMes[1] = 28;
        }
    }

}
