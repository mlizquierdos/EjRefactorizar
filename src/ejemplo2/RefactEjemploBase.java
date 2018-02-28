/*
 * https://jadcode.wordpress.com/2014/06/25/refactorizacion/
 */
package ejemplo2;

/**
 * @author jadcode
 */
public class RefactEjemploBase {
    
    public static int f(int x, int y){
        return x+y;
    }
    
    public static void main(String[] args){
        int x=5, y=3, z;
        z=f(x,y);
        System.out.println(z);
    }
    
}
