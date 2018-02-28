/*
 * https://cysingsoft.wordpress.com/un-ejercicio-de-refactorizacion/
 */
package ejemplo3;

public class Fecha {
    
    private final int dia;
    private final int mes;
    private final int anio;
    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean validar() {
        if (dia < 1 || dia > 31)
            return false;
        if (mes < 1 || mes > 12)
            return false;
        // Refactor - Introduce - Método
        // int diasMes = diasMes();
        // Refactor - Eliminación segura
        if (dia > diasMes())
            return false;
        else 
            return true;
    }

    private int diasMes() {
        // determinamos la cantidad de días del mes:
        int diasMes = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: diasMes = 31; break;
            case 4:
            case 6:
            case 9:
            case 11 : diasMes = 30; break;
            case 2 : // verificación de año bisiesto
                // Refactor - Introduce - Método
                if (bisiesto())
                    diasMes = 29;
                else
                    diasMes = 28; 
                break;
        }
        return diasMes;
    }

    private boolean bisiesto() {
        return (anio % 400 == 0) ||  ( (anio % 4 == 0) && (anio % 100 != 0) );
    }
  
}
