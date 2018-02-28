package ejemplo1;

import java.util.List;

/**
 * @author m_lou
 */
public class Profesor extends Persona {
    
    private String nombre;
    private int edad;
    //String numeroDeTelefono;
    private List<Prestamo> prestamos;
    
    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }

    private static class Prestamo {

        public Prestamo() {
        }
    }
    
/*    public void printfInformacionPersonal(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroDeTelefono);
    }
*/
    public void printfTodaLaInformacion(){
        printfInformacionPersonal(); //Factorizar - Introducir - Método
        for (Prestamo p: getPrestamos()){
            System.out.println(p);
        }
    }

    public void printfInformacionPersonal() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Teléfono: " + numeroDeTelefono);
    }

    // Encapsular campos - Refactorizar
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the prestamos
     */
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * @param prestamos the prestamos to set
     */
    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

}
