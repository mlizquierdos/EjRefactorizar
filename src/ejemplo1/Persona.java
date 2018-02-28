package ejemplo1;

/**
 * @author m_lou
 */
public class Persona {
    
    String numeroDeTelefono;

    public Persona(String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }

    // poner el cursor dentro de la clase, y pulsar Alt+Insertar
    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
}
