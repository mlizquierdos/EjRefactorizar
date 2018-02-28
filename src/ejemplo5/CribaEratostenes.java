/*
 * https://tecdigital.tec.ac.cr/revistamatematica/HERRAmInternet/v8n2-DIC-007/Probabilidad_Primos_Factorizacion.pdf
 */
package ejemplo5;

import java.util.Vector;

public class CribaEratostenes {
/*
 * https://tecdigital.tec.ac.cr/revistamatematica/HERRAmInternet/v8n2-DIC-007/Probabilidad_Primos_Factorizacion.pdf
 */
    public static Vector HacerlistaPrimos(int n) {
        Vector salida = new Vector(1);
        int k = 1;
        int max = (n-3)/2;
        boolean[] esPrimo  = new boolean[max+1];
        for(int i = 0; i <= max; i++)
            esPrimo[i]=true;
        for(int i = 0; (2*i+3)*(2*i+3) <= n; i++) {
            k = i+1;
            if(esPrimo[i]) {
                while( ((2*k+1)*(2*i+3)) <= n) {
                    esPrimo[((2*k+1)*(2*i+3)-3)/2]=false;
                    k++;
                }
            }
        }
        salida.addElement(new Integer(2));
        for(int i = 0; i <=max; i++) { 
            if(esPrimo[i])
                salida.addElement(new Integer(2*i+3));
        }
        salida.trimToSize();
        return salida;
    }
    
    public static void main(String[] args) {
        System.out.println("\n\n");
        //-----------------------------------------------------------------
        int    n = 100;
        Vector primos;
        primos = HacerlistaPrimos(n);
        //Cantidad de primos <= n
        System.out.println("Primos <="+ n+": "+primos.size()+"\n");
        //imprimir vector (lista de primos)
        for(int p = 1; p < primos.size(); p++) {
            Integer num = (Integer)primos.elementAt(p);
            System.out.println(""+(int)num.intValue());
        }
        //-----------------------------------------------------------------
        System.out.println("\n\n");
    }
}
