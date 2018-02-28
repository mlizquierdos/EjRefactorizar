package ejemplo4;

/**
 * @author https://archive.cnx.org/contents/b6cd4ee4-52d3-4454-bc98-18d962a35f9c@3/refactoring-con-netbeans
 */
public class Circulo {

    private int x;
    private int y;
    private double radio;

    public Circulo() {

    }

    // constructor
    public Circulo( int valorX, int valorY, double valorRadio) {
        x = valorX;
        y = valorY;
        establecerRadio( valorRadio );
    }

    public void establecerX( int valorX ) {
        x = valorX;
    }

    public int obtenerX() {
        return x;
    }

    public void establecerY( int valorY ) {
        y = valorY;
    }

    public int obtenerY() {
        return y;
    }

    public void establecerRadio( double valorRadio ) {
        radio = ( valorRadio < 0.0 ? 0.0 : valorRadio );
    }

    public double obtenerRadio() {
        return radio;
    }

    public double obtenerDiametro() {
        return 2 * radio;
    }

    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    public String toString() {
        return "Centro = [" + x + ", " + y + "]; Radio = " + radio;
    } 
    
}