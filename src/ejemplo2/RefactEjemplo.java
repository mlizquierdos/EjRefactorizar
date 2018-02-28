/*
 * https://jadcode.wordpress.com/2014/06/25/refactorizacion/
 */
package ejemplo2;

import ejemplo2.operacion.Operaciones;

/**
 * @author jadcode
 */
public class RefactEjemplo {
    
    // movemos las variables manualmente
    // Así, al colocarlas aquí, introducimos los setters y getters:
    // Refactor/Encapsular campos
    private static int num1, num2, resultado;
    
    
    public static void main(String[] args){
        // Refactor/Rename… y la renombramos “num1”, y así con el resto
        resultado=Operaciones.sumarDos(num1,num2);
        // Introduce/Method… para introducir una función llamada “mostrarResultado”
        mostrarResultado(resultado);
    }

    public static void mostrarResultado(int resultado) {
        System.out.println(resultado);
    }

    /**
     * @param aNum1 the num1 to set
     */
    public static void setNum1(int aNum1) {
        num1 = aNum1;
    }

    /**
     * @param aNum2 the num2 to set
     */
    public static void setNum2(int aNum2) {
        num2 = aNum2;
    }
    
}
