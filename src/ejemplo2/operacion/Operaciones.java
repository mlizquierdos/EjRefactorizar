/*
 * crearnos la clase Operaciones en el mismo paquete que la clase principal (RefactoringExample). 
 * Tal vez no nos convenza tener ambas clases en la misma carpeta. 
 * Los que hacemos es crearnos el paquete operacion.
 */
package ejemplo2.operacion;

/**
 *
 * @author m_lou
 */
public class Operaciones {

    // Refactor/Rename… y la renombramos “sumarDos”
    public static int sumarDos(int num1, int num2) {
        return num1 + num2;
    }
    
    public static int restarDos(int num1, int num2){
        // Nos situamos sobre la variable, vamos a Refactor/Inline… y vemos lo que realizará. 
        // Si es lo que queremos, "Ejecutar refactorización"
        return num1 - num2;
    }
}
